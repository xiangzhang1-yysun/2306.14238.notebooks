import unicodedata
import sys

# Read the content of the sample.txt file
with open(f"1.txt", "r") as file:
    content = file.read()

# Normalize the content
normalized_content = unicodedata.normalize("NFKD", content)

# Write the cleaned content to a new file
with open(f"2.txt", "w") as file:
    file.write(normalized_content)