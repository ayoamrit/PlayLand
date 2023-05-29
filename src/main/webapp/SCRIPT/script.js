//Array of game serial numbers
const gameList = ["GTA4", "ACV", "REB", "FC3R", "TW3", "GOW", "COD2", "NFSH", "MR", "BF1"]

function addToCart(gameSerialNumber, alertHead, alertBody){

    //If serial of the selected game is already in the local storage
    if(gameSerialNumber in localStorage){

        //Error alert will be displayed
        customAlert.alert("The game you've chosen is already in your cart.","Heads Up");
    }
    //If serial number of the selected game is not in the local storage
    else{
        //The serial number will be added to the local storage
        localStorage.setItem(gameSerialNumber, gameSerialNumber);
        //Success alert will be displayed
        customAlert.alert("The game has been successfully added to your shopping cart.", "Success");
    }
}

//Function to retrieve the selected game information
function getGameInformation(gameSerialNumber){

    //Using switch statement to return the name and price of the selected name
    switch(gameSerialNumber){
        case 'GTA4':
            return [49.99, "Grand Theft Auto IV"];

        case 'ACV':
            return [56.65, "Assassins Creed Valhalla"];

        case 'REB':
            return[19.99,"Resident Evil Biohazard"];

        case 'FC3R':
            return [39.99, "Far Cry III Reborn"];

        case 'TW3':
            return [89.88, "The Witcher III Wild Hunt"];

        case 'GOW':
            return[9.99,"God Of War"];

        case 'COD2':
            return [69.99, "Call Of Duty II"];

        case 'NFSH':
            return [79.59, "Need For Speed Heat"];

        case 'MR':
            return[16.99,"Mud Runner"];

        default:
            return [119.09, "Battlefield I"]
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

            //Counting the total cost
            total = total + selectedGameInformation[0];

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

    //Retrieve the element with the ID "total" and update its content with the
    //formatted value of "total"
    document.getElementById("purchase-total").innerHTML = total.toFixed(2);
}

function clearCart(){
    //Clearing the local storage, removing all data record
    localStorage.clear();

    //Changing the total value
    document.getElementById("purchase-total").innerHTML = "";

    //Counting the number of rows in the table
    let rowCount = document.getElementById("table").rows.length;

    //Looping through each row in the table, starting from second row (index 1)
    for(let x = 1; x<rowCount;x++){
        //Delete the first row (index 1) from the table
        document.getElementById("table").deleteRow(1);
    }
}



function CustomAlert(){
    this.alert = function(message,title){
        document.body.innerHTML = document.body.innerHTML + '<div id="dialogoverlay"></div><div id="dialogbox" class="slit-in-vertical"><div><div id="dialogboxhead"></div><div id="dialogboxbody"></div><div id="dialogboxfoot"></div></div></div>';

        let dialogoverlay = document.getElementById('dialogoverlay');
        let dialogbox = document.getElementById('dialogbox');

        let winH = window.innerHeight;
        dialogoverlay.style.height = winH+"px";

        dialogbox.style.top = "100px";

        dialogoverlay.style.display = "block";
        dialogbox.style.display = "block";

        document.getElementById('dialogboxhead').style.display = 'block';

        if(typeof title === 'undefined') {
            document.getElementById('dialogboxhead').style.display = 'none';
        } else {
            document.getElementById('dialogboxhead').innerHTML = '<i class="fa fa-exclamation-circle" aria-hidden="true"></i> '+ title;
        }
        document.getElementById('dialogboxbody').innerHTML = message;
        document.getElementById('dialogboxfoot').innerHTML = '<button class="pure-material-button-contained active" onclick="customAlert.ok()">OK</button>';
    }

    this.ok = function(){
        document.getElementById('dialogbox').style.display = "none";
        document.getElementById('dialogoverlay').style.display = "none";
    }
}

let customAlert = new CustomAlert();