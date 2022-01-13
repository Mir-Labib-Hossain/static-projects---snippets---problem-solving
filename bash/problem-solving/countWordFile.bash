#!/bin/bash
file_path="text.txt"

characters=`wc --c < $file_path`
     words=`wc --w < $file_path`
     lines=`wc --l < $file_path`

echo "Number of characters = $characters"
echo "Number of words = $words"
echo "Number of lines = $lines"