#include <iostream>
#include <cmath>

using namespace std;

int main() {
  string x;
  cout << "sin/cos/tan>";
  cin >> x;
  if (!x.compare("sin")) {
    int sine;
    cout << "Type the number you want to sine>";
    cin >> sine; 
    cout << sin(sine);
  } else if (!x.compare("cos")){
    int cosine;
    cout << "Type the number you want to cosine>";
    cin >> cosine;  
    cout << cos(cosine);
  } else if (!x.compare("tan")){
    int tangent;
    cout << "Type the number you want to tangent>";
    cin >> tangent; 
    cout << tan(tangent);
  }
  return 0;
}
