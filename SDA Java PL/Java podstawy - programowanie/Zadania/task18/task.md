Napisz program, który wczyta datę w standardowym formacie `yyyy-MM-dd` i wypisze datę najbliższego piątku w tym samym formacie.

<div class="hint">

Aby wczytać datę skanerem, wczytaj najpierw tekst (`String`), a potem przekształć do typu `LocalDate` 
używając metody `LocalDate.parse(...)`
</div>

<div class="hint">

Aby odnaleźć najbliższy piątek, dodawaj jeden dzień do daty tak długo, aż dojdziesz do piątku.
</div>