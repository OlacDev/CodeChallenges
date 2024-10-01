function generateRandomNumber() {
    return Math.floor(Math.random() * 100) + 1;
}

function guessingGame() {
    let secretNumber = generateRandomNumber();
    let attempts = 0;
    
    alert("Welcome to the guessing game!");
    alert("Try to guess the number between 1 and 100.");
    
    while (true) {
        let guess = prompt("What's your guess?");
        if (isNaN(guess) || guess === null || guess.trim() === "") {
            alert("Please enter a valid number.");
            continue;
        }
        guess = parseInt(guess);
        attempts++;
        
        if (guess < secretNumber) {
            alert("Too low. Try again.");
        } else if (guess > secretNumber) {
            alert("Too high. Try again.");
        } else {
            alert(`Congratulations! You guessed the number in ${attempts} attempts.`);
            break;
        }
    }
}

guessingGame();
