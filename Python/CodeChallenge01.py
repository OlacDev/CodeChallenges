import random

def guessing_game():
    secret_number = random.randint(1, 100)
    attempts = 0
    
    print("Welcome to the guessing game!")
    print("Try to guess the number between 1 and 100.")
    
    while True:
        guess = int(input("What's your guess?"))
        
        attempts += 1
        
        if guess < secret_number:
            print("Too low. Try again.")
        elif guess > secret_number:
            print("Too high. Try again.")
        else:
            print(f"Congratulations! You guessed the number in {attempts} attempts.")
            break

if __name__ == "__main__":
    guessing_game()
