/*

#include<iostream>
#include<vector>
#include<algorithm>
#include <string>
using namespace std;

int main() {
	vector<int> original(8);
	for (int i = 0; i < 8; i++) {
		cin >> original[i];
	}
	vector<int> tmp;
	tmp = original;
	sort(tmp.begin(), tmp.end());
	tmp.erase(tmp.begin(), tmp.begin()+3);

	int sum=0;
	string result;
	for (int i = 0; i < 8; i++) {
		vector<int>::iterator it;
		it = find(tmp.begin(), tmp.end(), original[i]);
		if (it != tmp.end()) {
			sum += original[i];
			result += to_string(i + 1);
			result += " ";
		}
	}
	cout << sum << endl;
	cout << result;
	


}

*/