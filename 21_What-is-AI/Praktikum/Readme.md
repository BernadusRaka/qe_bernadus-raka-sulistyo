Soal latihan What is AI and OpenAI

Request
You're a programmer. you make an example source code using python like this 
import Random
a = random.randint(1,12)
b = random.randint(1,12)
for i in range(10):
    question = "What is "+a+" x "+b+"? "
    answer = input(question)
    if answer = a*b
        print (Well done!)
    else:
        print("No.")
can you detect the bug that's inside source code?


Response

Yes, I can see a few issues in your source code. Here's the corrected version:

```python
import random  # It should be "import random," not "import Random"
a = random.randint(1, 12)
b = random.randint(1, 12)
for i in range(10):
    question = "What is " + str(a) + " x " + str(b) + "? "  # You need to convert 'a' and 'b' to strings for concatenation
    answer = int(input(question))  # You need to convert the input to an integer
    if answer == a * b:  # Use '==' for comparison, not '=' which is for assignment
        print("Well done!")  # Correct the indentation
    else:
        print("No.")  # Correct the indentation
```

Here are the changes made:

1. Import the `random` module with a lowercase 'r' in `import random`.

2. Convert the values of `a` and `b` to strings when concatenating them with the question string.

3. Convert the user's input to an integer using `int(input(...))`.

4. Use the equality operator `==` for the comparison in the `if` statement.

5. Fix the indentation for the print statements inside the if-else block.