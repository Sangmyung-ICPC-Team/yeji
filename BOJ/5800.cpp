/*

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int comp(int i, int j) {
	return j < i;
}

int main() {
	int T;
	cin >> T;
	for(int c=1;c<=T;c++){
		int n;
		int ma = 0;
		cin >> n;
		vector <int> v(n);
		for (int i = 0; i < n; i++) {
			cin >> v[i];
		}
		sort(v.begin(), v.end(), comp);

		for (int i = 0; i < n-1; i++) {
			ma = max(v[i] - v[i+1], ma);
		}

		cout << "Class " << c <<endl;
		cout << "Max "<< v[0] <<", Min "<< v[n-1] <<", Largest gap " << ma<<endl;

	}

	return 0;
}



*/