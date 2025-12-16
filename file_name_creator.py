# filename_generator.py
import pyperclip


def generate_filename(problem_name: str) -> str:
    # Remove leading/trailing spaces
    problem_name = problem_name.strip()
    
    # Extract number (if any) before a dot
    parts = problem_name.split('.', 1)
    if len(parts) == 2 and parts[0].strip().isdigit():
        num = int(parts[0].strip())
        title = parts[1].strip()
    else:
        num = None
        title = problem_name
    
    # Convert title to lowercase with underscores
    title_snake = '_'.join(title.lower().split())
    
    # Build filename
    if num is not None:
        filename = f"_{num:02d}_{title_snake}.py"
    else:
        filename = f"{title_snake}.py"
    
    pyperclip.copy(filename)
    return filename


if __name__ == "__main__":
    user_input = input("Enter problem name: ")
    print("Generated filename:", generate_filename(user_input))
