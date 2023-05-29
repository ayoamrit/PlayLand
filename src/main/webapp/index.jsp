<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>PlayLand</title>
    <link href="CSS/style.css" rel="stylesheet" type="text/css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Amatic+SC&family=Chakra+Petch:wght@300&family=Old+St
        andard+TT&family=Poppins:wght@300&display=swap" rel="stylesheet">
</head>

<script src="SCRIPT/script.js"></script>
<body>
    <header>
        <div class="nav">
            <div class="logo">
                <p>PlayLand</p>
            </div>
            <div class="link">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="contact.html">Contact</a></li>
                    <li><a href="cart.html">Cart</a></li>
                </ul>
            </div>
        </div>

    </header>


    <div class="items">

        <div class="game">
            <img class="image" src="IMG/GrandTheftAuto.jpg">
            <div class="middle">
                <button onclick="addToCart('GTA4')" class="button">$49.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/AssassinsCreed.jpg">
            <div class="middle">
                <button onclick="addToCart('ACV')" class="button">$56.65</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/ResidentEvil.jpg">
            <div class="middle">
                <button onclick="addToCart('REB')" class="button">$19.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/FarCryReborn.jpg">
            <div class="middle">
                <button onclick="addToCart('FC3R')" class="button">$39.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/TheWitcher.jpg">
            <div class="middle">
                <button onclick="addToCart('TW3')" class="button">$89.88</button>
            </div>
        </div>

    </div>

    <br>

    <div class="items">

        <div class="game">
            <img class="image" src="IMG/GodOfWar.jpg">
            <div class="middle">
                <button onclick="addToCart('GOW')" class="button">$9.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/CallOfDuty.jpg">
            <div class="middle">
                <button onclick="addToCart('COD2')" class="button">$69.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/NeedForSpeed.jpg">
            <div class="middle">
                <button onclick="addToCart('NFSH')" class="button">$79.59</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/MudRunner.jpg">
            <div class="middle">
                <button onclick="addToCart('MR')" class="button">$16.99</button>
            </div>
        </div>

        <div class="game">
            <img class="image" src="IMG/Battlefield.jpg">
            <div class="middle">
                <button onclick="addToCart('BF1')" class="button">$119.09</button>
            </div>
        </div>
    </div>

    <footer>
        <div class="column-1">
            <h3>PlayLand</h3>
            <p>"Welcome to our online gamestore! We offer a wide selection of games<br> for all interests and playing
            styles. Our collection includes best-selling action<br> and racing, as well as rare and hard-to-find titles."</p>
        </div>

        <div class="column-2">
            <h3>Get to Know Us</h3>
            <ul>
                <li>Careers</li>
                <li>Investor Relations</li>
                <li>Press Releases</li>
                <li>Community</li>
            </ul>
        </div>

        <div class="column-3">
            <h3>Rewards</h3>
            <ul>
                <li>Coupons</li>
                <li>Gift Cards</li>
                <li>Points</li>
                <li>Refund Policy</li>
            </ul>
        </div>

        <div class="column-4">
            <h3>Follow Us</h3>
            <ul>
                <li>Instagram</li>
                <li>Facebook</li>
                <li>Twitter</li>
                <li>Youtube</li>
            </ul>
        </div>
    </footer>
</body>
</html>