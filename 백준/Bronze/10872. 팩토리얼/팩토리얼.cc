#include <iostream>
using namespace std;

int recursive(int a) {
	if (a > 2)
		a *= recursive(a - 1);
	return a;

}

int main() {
	int N, result = 1;
	cin >> N;
	if (N != 0) {
		result = recursive(N);
	}
	cout << result << endl;

}