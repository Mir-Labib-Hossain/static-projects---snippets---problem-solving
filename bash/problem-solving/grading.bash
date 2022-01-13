echo "Enter id, name, subject name, score (Separated using coma Ex : 07, Labib, UNIX, 98) :"
read info
IFS=","
read -a arr <<< "$info"

score=$((arr[3]))
if (( $score >= 80 ))
then
    grade="A+"
elif (( $score >= 70 ))
then
    echo "A"
elif (( $score >= 60 ))
then
    grade="A-"
elif (( $score >= 50 ))
then
    grade="B"
elif (( $score >= 40))
then
    echo "C"
elif (( $score >= 33 ))
then
    grade="D"
else
    grade="F"
fi
echo "${arr[0]}  ${arr[1]} got $grade in ${arr[2]}" | xargs 
# | xargs for trimming