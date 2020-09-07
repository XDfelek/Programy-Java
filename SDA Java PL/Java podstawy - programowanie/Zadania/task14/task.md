Napisz program, który wczyta od użytkownika dwie całkowite liczby dodatnie i wypisze ich **największy wspólny
 dzielnik** (NWD), korzystając z algorytmu Euklidesa w wersji z modulo.
 
 Największy wspólny dzielnik (NWD) dwóch liczb to największa liczba naturalna, która dzieli bez reszty obie liczby.
 
 Przykładowo, **NWD z `16` i `24` to `8`**, ponieważ `8` jest najmniejszą liczbą, która dzieli zarówno `16` (dając wynik `2`), jaki i `24` (dając wynik `3`).
 
 Algorytm Euklidesa dla liczb `a` i `b` z wykorzystaniem pomocniczej zmiennej `c` jest następujący:
 ```
1. Dopóki `b!=0` wykonuj kroki 2..5; w przeciwnym wypadku idź do kroku 6.
2.      c = reszta z dzielenia a przez b
3.      za 'a' podstaw wartość b
4.      za 'b' podstaw wartość c
5.      wróć do linijki 1.
6. Wynikiem jest liczba a    
 ``` 