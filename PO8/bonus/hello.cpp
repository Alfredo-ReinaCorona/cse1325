#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(int argc, char** argv)
{

    std::vector<std::string> save_argv;

    for(int x=0;x<argc;x++)
    {
        save_argv.push_back(argv[x]);
    }

    for(int y=0;y<argc;y++)
    {
        reverse(save_argv[y].begin(),save_argv[y].end());
    }
    
    for(int z=0;z<argc;z++)
    {
        cout<<save_argv[z]<<"\n";
    }
}
