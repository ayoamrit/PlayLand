//Array of game serial numbers
const gameList = ["GTA4", "ACV", "REB", "FC3R", "TW3", "GOW", "COD2", "NFSH", "MR", "BF1"]

function addToCart(gameSerialNumber){

    //If serial of the selected game is already in the local storage
    if(gameSerialNumber in localStorage){

        //Error alert will be displayed
        errorAlert();
    }
    //If serial number of the selected game is not in the local storage
    else{
        //The serial number will be added to the local storage
        localStorage.setItem(gameSerialNumber, gameSerialNumber);
        //Success alert will be displayed
        successAlert();
    }
}

function errorAlert(){
    //Sending an alert when game is already existing in the cart
    alert("Selected game already exist in the shopping cart.");
}

function successAlert(){
    //Sending an alert when game is added to the cart successfully
    alert("Game has been added to the shopping cart.");
}

//Function to retrieve the selected game information
function getGameInformation(gameSerialNumber){

    //Using switch statement to return the name and price of the selected name
    switch(gameSerialNumber){
        case 'GTA4':
            return ["$49.99", "Grand Theft Auto IV"];

        case 'ACV':
            return ["$56.65", "Assassins Creed Valhalla"];

        case 'REB':
            return["$19.99","Resident Evil Biohazard"];

        case 'FC3R':
            return ["$39.99", "Far Cry III Reborn"];

        case 'TW3':
            return ["$89.88", "The Witcher III Wild Hunt"];

        case 'GOW':
            return["$9.99","God Of War"];

        case 'COD2':
            return ["$69.99", "Call Of Duty II"];

        case 'NFSH':
            return ["$79.59", "Need For Speed Heat"];

        case 'MR':
            return["$16.99","Mud Runner"];

        default:
            return ["$119.09", "Battlefield I"]
    }
}

function loadShoppingCart(){
    //Get reference ti the table element
    var table = document.getElementById("table");

    //Variable to keep track of the total cost
    var total = 0;

    //Counter for row index
    let rowCount = 1;

    //Loop through the gameList array
    for(let x = 0;x<gameList.length;x++){

        //Check if the game exists in the localStorage
        if(gameList[x] in localStorage) {
            //Insert a new row into the table
            var row = table.insertRow(rowCount);

            //Retrieve the game information based on the gameSerialNumber
            let selectedGameInformation = getGameInformation(gameList[x]);

            //Loop through the selected game information array
            for (y = 0; y < selectedGameInformation.length; y++) {

                //Insert a new cell into the row and populate it with game information
                var cell = row.insertCell(0);
                cell.innerHTML = selectedGameInformation[y];
            }

            //Increment the row counter
            rowCount = rowCount + 1;
        }
    }
}

function clearCart(){
    //Clearing the local storage, removing all data record
    localStorage.clear();

    //Counting the number of rows in the table
    let rowCount = document.getElementById("table").rows.length;

    //Looping through each row in the table, starting from second row (index 1)
    for(let x = 1; x<rowCount;x++){
        //Delete the first row (index 1) from the table
        document.getElementById("table").deleteRow(1);
    }
}