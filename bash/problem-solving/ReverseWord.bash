read text
for i in $text
do
    echo -n $i | rev
    echo -n " "
done