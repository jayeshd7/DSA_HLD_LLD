#!  /bin/bash

# shellcheck disable=SC1068
Set -x
Set -v

# shellcheck disable=SC2039
for a in {1..10}; do
  if [[ $a == 11 ]]; then
    break
  else
    echo $a
  fi
done