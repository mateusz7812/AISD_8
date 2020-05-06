# AISD_8

zad1:
    Tablica haszująca znajduje się w klasie MyHashTable, działa na podstawie wbudowanej metody hashCode, 
  oraz wykorzystuje metodę łańcuchową do rozwiązywania kolizji.

zad2:
    Algorytm sprawdzający czy dla zadanych dwóch ciągów znaków, jeden z nich składa się z liter 
  występujacych w ciągu drugim znajduje się w pliku SubSetAlgorithm. 
  Złożoność algorytmowa metody IsSubSet jest równa n^2, ponieważ jest w niej pętla while 
  wywołująca metodę Contains klasy MyHashTable, która ma złożoność obliczeniową n (pętla for).

  Czy można to zadanie rozwiązać w inny sposób?
    Jeśli litery w obu tablicach są posortowane, lepszym sposobem jest równoległe iterowanie po obu tablicach naraz i 
  porównywanie kolejnych elementów, wtedy złożoność obliczeniowa wynosi n, jednak w wypadku gdy litery są w 
  losowej kolejności nie widzę szybszego sposobu niż ten zaimplementowany.
