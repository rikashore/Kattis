// Solving the aaah problem
// https://open.kattis.com/problems/aaah

#include <iostream>
#include <string>

int main() 
{
    std::string a, b;
    std::getline(std::cin, a);
    std::getline(std::cin, b);
    if (a.length() > b.length())
    {
        std::cout << "go";
    }
    else
    {
        std::cout << "no";
    }
    return 0;
}
