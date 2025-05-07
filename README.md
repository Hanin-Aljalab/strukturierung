# 📐 Vektor

## 🛠️ Ziel des Projekts

Ziel ist die Implementierung einer **unveränderlichen (immutable)** Klasse `Vektor` zur Darstellung und Berechnung dreidimensionaler Vektoren mit reellen Komponenten (Datentyp `double`). Die Klasse soll zentrale Vektoroperationen wie Addition, Kreuzprodukt oder Kollinearität unterstützen.

---

## 🔧 Funktionen der Klasse `Vektor`

- Anlegen eines neuen Vektors und Befüllen des Vektors mit Daten
- Erzeugen eines Nullvektors (alle drei Komponenten [x,y,z] sind 0)
- Addieren zweier Vektoren
- Subtrahieren zweier Vektoren
- Auslesen einzelner Komponenten x,y und z
- Auslesen aller Komponenten auf einmal als Array
- Multiplikation des Vektors mit einem Skalar
- Skalarmultiplikation zweier Vektoren
- Kreuzprodukt zweier Vektoren
- Erzeugung des Einheitsvektors aus einem gegebenen Vektor (d.h. Vektor der Länge 1 mit derselben Richtung wie der ursprüngliche Vektor)
- Berechnung des Betrages (der Länge) eines Vektors
- Test, ob zwei Vektoren kollinear (parallel oder antiparallel) sind
- Bestimmen des eingeschlossenen Winkels zweier Vektoren
---

## 🧪 Tests (JUnit)

Zur Validierung wurden gezielte Tests implementiert.  
**Beispieldaten:**

### Skalarmultiplikation
- `6 * (1, -5, 3) = (6, -30, 18)`
- `-3 * (1, -5, 3) = (-3, 15, -9)`

### Skalarprodukt
- `(1, 2, 3) · (-7, 8, 9) = 36`
- `(-5, 9, 7) · (10, 3, 8) = 33`

### Addition / Subtraktion
- `(4, 0, 8) + (-1, 4, 7) = (3, 4, 15)`
- `(4, 0, 8) - (-1, 4, 7) = (5, -4, 1)`

### Kreuzprodukt
- `(1, 2, 3) × (-7, 8, 9) = (-6, -30, 22)`
- `(1, 2, 8) × (4, 3, 5) = (-14, 27, -5)`

### Betrag
- `|(1, 1, 1)| = √3`
- `|(5, 4, 3)| = √50`

### Kollinearität
- `(4, 5, 7)` und `(16, 20, 28)` → ✅ kollinear  
- `(4, 5, 7)` und `(16, 20, 21)` → ❌ nicht kollinear

### Winkel
- ∠ zwischen `(3, -1, 2)` und `(1, 2, 4)` ≈ **58,3°**

### Kombination
- `[(−1, 5, −2) × (2, 1, 2)] · (2, 0, 5) = -31`
