arr="a z c a e f a b h j"
echo "${arr[@]}" | tr ' ' '\n' | sort -u | tr '\n' ' '

# -u used delete dublicate characters from the string. 