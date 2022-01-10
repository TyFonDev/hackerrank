#!/bin/bash

read -r -p "Ingrese el nombre del ejercicio: " nombreEjercicio

IFS=' ' read -r -a array -p "Ingrese el nombre del ejercicio: " <<<"$nombreEjercicio"

nombreArchivo=""
arrayLength=${#array[@]}

for index in ${!array[@]}; do
  if [ $index -eq $(($arrayLength - 1)) ]; then
    nombreArchivo+="${array[$index]}"
  else
    nombreArchivo+="${array[$index]}_"
  fi
done

mkdir -p ${nombreArchivo}
echo "Se creó carpeta ${nombreArchivo}"

javascript() {
  cd ${nombreArchivo}
  mkdir javascript
  cd javascript
  touch index.js
  cd ..
}

java() {
  cd ${nombreArchivo}
  mkdir java
  cd java
  touch Test.java
  cd ..
}

echo "Crear carpeta Javascript?"
select yn in "Si" "No"; do
  case $yn in
  Si)
    javascript
    break
    ;;
  No) exit ;;
  esac
done

echo "Crear carpeta Java?"
select yn in "Yes" "No"; do
  case $yn in
  Yes)
    java
    break
    ;;
  No) exit ;;
  esac
done
