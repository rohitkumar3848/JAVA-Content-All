#include <iostream>
#include <math.h>
#include <vector>
#include <algorithm>
#include<vector>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int l = s.length();
    string org = s;
    s.pop_back();
    double max, temp;
    max = std::stoll(s);
    string str = org;
    for (int i = 0; i < l; i++)
    {
        org.erase(i, 1);
        temp = stoll(org);
        if(temp>max)
        max = temp;
        org = str;
    }
    cout<<max;
    return 0;
}