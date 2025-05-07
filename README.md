# 📐 Vektor

**🎓 Benotetes Assignment – Medizinische Informatik**  
📆 **Abgabe bis: 13.04.2025**

## 📁 Paketstruktur

Alle Klassen befinden sich im Paket:  
`pr2.strukturierung.vektor`

---

## 🛠️ Ziel des Projekts

Ziel ist die Implementierung einer **unveränderlichen (immutable)** Klasse `Vektor` zur Darstellung und Berechnung dreidimensionaler Vektoren mit reellen Komponenten (Datentyp `double`). Die Klasse soll zentrale Vektoroperationen wie Addition, Kreuzprodukt oder Kollinearität unterstützen.

---

## 🔧 Funktionen der Klasse `Vektor`

- ✅ Erstellen von Vektoren mit x-, y-, z-Komponenten  
- ✅ Nullvektor erzeugen  
- ✅ Komponenten auslesen (`getX`, `getY`, `getZ`, `toArray`)  
- ✅ Addition & Subtraktion  
- ✅ Skalarmultiplikation (mit Zahl oder Vektor)  
- ✅ Kreuzprodukt  
- ✅ Betrag (Länge) berechnen  
- ✅ Einheitsvektor erzeugen  
- ✅ Prüfung auf Kollinearität  
- ✅ Winkel zwischen zwei Vektoren berechnen  
- ✅ `equals()`-Methode zur Vergleichbarkeit  
- ✅ `toString()` zur Ausgabe als Zeichenkette  
- ✅ Dokumentation aller Methoden mit JavaDoc

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

---

## ▶️ Ausführen & Testen

### Kompilieren & Ausführen

```bash
javac pr2/strukturierung/vektor/Vektor.java
