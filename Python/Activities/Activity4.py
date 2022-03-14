while True:
    player_1 = input("Player 1 enter rock, paper or scissor: ")
    player_2 = input("Player 2 enter rock, paper or scissor: ")
    if player_1 == player_2:
        print("It's a tie!")
    elif player_1 == 'rock':
        if player_2 == 'scissor':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif player_1 == 'scissor':
        if player_2 == 'paper':
            print("Scissor wins!")
        else:
            print("Rock wins!")
    elif player_1 == 'paper':
        if player_2 == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    repeat = input("Do you want to play another round, yes or no? ")
    if (repeat == "yes"):
        pass
    elif (repeat == "no"):
        raise SystemExit
