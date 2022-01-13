#include <stdio.h>
#include <string.h>

int main () {
    int i;
    char s[10][31] = { "" };

    for (i = 0; i < 10; i++) {
        if (!fgets (s[i], sizeof s[i], stdin))
            break;
        size_t len = strlen (s[i]);
        if (s[i][len-1] == '\n')
            s[i][--len] = 0;
    }
    printf("%s\n",s+2);
    printf("%s\n",s+6);
    printf("%s\n",s+8);
    return 0;
}

