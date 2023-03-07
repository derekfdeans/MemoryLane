#include <iostream>

int getInput();

int main() {
	cout << "choose a password: ";
	int answer;
	cin >> answer;

	cout << "what's the password? " << answer;
	for (int i = getInput(); i != answer; cin >> i) {
		if (i != answer) {
			cout << "that's incorrect. try again";
		}
	}
}

int getInput() {
	int number;
	cin >> number;
	return cin;
}