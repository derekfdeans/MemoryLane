#include <iostream>

int getInput();

int main() {
	std::cout << "choose a password: ";
	int answer;
	std::cin >> answer;

	std::cout << "what's the password? ( " << answer << " )";
	for (int i = getInput(); i != answer; i = getInput()) {
		if (i != answer) {
			std::cout << "that's incorrect. try again: ";
		}
	}
	std::cout << "\nthat's correct!";
}

int getInput() {
	int number;
	std::cin >> number;
	return number;
}
