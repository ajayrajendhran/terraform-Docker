def print_arr(arr):
    for row in arr:
        print(" ".join(row))
    print()

def check_winner(arr, symbol):
    for i in range(3):
        if all(arr[i][j] == symbol for j in range(3)):
            return True
        if all(arr[j][i] == symbol for j in range(3)):
            return True
    
    if arr[0][0] == symbol and arr[1][1] == symbol and arr[2][2] == symbol:
        return True
    if arr[0][2] == symbol and arr[1][1] == symbol and arr[2][0] == symbol:
        return True
 # the above two will check in the "X" pattern 
    return False

def player1(arr):
    print("Player 1, please enter your input (1-9):")
    s = input()
    if s.isdigit() and '1' <= s <= '9':
        c = s
        for i in range(3):
            for j in range(3):
                if arr[i][j] == c:
                    arr[i][j] = '*'
                    if check_winner(arr, '*'):
                        print_arr(arr)
                        print("Player 1 wins!")
                        exit(0)
                    break
        print_arr(arr)
        player2(arr)
    else:
        print("Invalid input. Exiting.")
        exit(0)

def player2(arr):
    print("Player 2, please enter your input (1-9):")
    s = input()
    if s.isdigit() and '1' <= s <= '9':
        c = s
        for i in range(3):
            for j in range(3):
                if arr[i][j] == c:
                    arr[i][j] = 'o'
                    if check_winner(arr, 'o'):
                        print_arr(arr)
                        print("Player 2 wins!")
                        exit(0)
                    break
        print_arr(arr)
        player1(arr)
    else:
        print("Invalid input. Exiting.")
        exit(0)

def main():
    c = 1
    arr = [[str(c + i * 3 + j) for j in range(3)] for i in range(3)]
    print_arr(arr)
    player1(arr)

if __name__ == "__main__":
    main()
