echo -n "Enter search text : "
read input
echo -n "No. of occurence : "
echo `grep -o $input "text.txt" | wc --l`

# grep used for searching $input variable from text file
#-o, --only-matching Print
# wc --l used for counting the occurence