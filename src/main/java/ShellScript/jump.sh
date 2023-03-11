#!/bin/zsh
# shellcheck disable=SC1068

# This is the path to the file that we want to check if it exists
function jump() {
    OLDIFS = $IFS

    IFS = /
    path_arr = {$PWD}
    IFS=$OLDIFS

    local pos = -1
    for dir in $path_arr; do
      pos = $((pos + 1))
        if [[ $dir == $1 ]]; then
            break
        fi
        pos = $((pos + 1))
    done



}