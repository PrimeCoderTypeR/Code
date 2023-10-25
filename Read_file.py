with open("Input.txt") as file:
    input = [int(line) for line in file.read().strip().split("\n")]
    print(input)