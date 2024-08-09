def print_arr(arr):
    for row in arr:
        print(" ".join(row))
    print()

def player1(arr):
    print("Player 1, please enter your input (1-9):")
    s = input().strip()
    if s.isdigit() and '1' <= s <= '9':
        c = s
        for i in range(3):
            for j in range(3):
                if arr[i][j] == c:
                    arr[i][j] = '*'
        print_arr(arr)
        player2(arr)
    else:
        print("Invalid input. Exiting.")
        exit(0)

def player2(arr):
    print("Player 2, please enter your input (1-9):")
    s = input().strip()
    if s.isdigit() and '1' <= s <= '9':
        c = s
        for i in range(3):
            for j in range(3):
                if arr[i][j] == c:
                    arr[i][j] = 'o'
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
