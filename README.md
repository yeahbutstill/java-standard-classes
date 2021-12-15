# java-standard-classes

## String Class

- String yang pernah dibahas dimateri Java Dasar, String adalah object, artinya dia memiliki representasi class nya
- Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa saja yang tersedia
  dihalaman dokumentasi javadoc nya.

## Method di String Class

| Method                    | Keterangan                                   |
|---------------------------|----------------------------------------------|
| String toLowerCase()      | Membuat string baru dengan format lower case |
| String toUpperCase()      | Membuat string baru dengan format upper case |
| int length()              | Mendapatkan panjang string                   |
| boolean startsWith(value) | Mengecek apakah dimulai dengan string value  |
| boolean endsWith(value)   | Mengecek apakah diakhiri dengan string value |
| String[] split(value)     | Memotong string dengan string value          |

## StringBuffer dan StringBuilder Class

## Immutable String

- String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang
  dilakukan di Java adalah membuar String baru.
- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan
  memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

## StringBuffer vs StringBuilder

- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
- Yang membedakan adalah, StringBuffer itu Thread Safe, sedangkan StringBuilder tidak Thread Safe
- Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak
  butuh paralel, cukup gunakan StringBuilder
- Karena StringBuffer dibuat agar Thread Safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder

## StringJoiner Class

- StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter(pemisah)
- StringJoiner juga mendukung prefix(depan) dan suffix(belakang) jika kita ingin menambahkannya
- Ini sangat bagus ketika ada kasus misalnya kita ingin mem-print Array dengan format yang kita mau misalnya

## StringTokenizer Class

- StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau String yang lebih
  kecil
- Kita bisa memotong String dengan delimiter yang kita mau

## Nummber Class

- Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
- Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
- Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya

## Method di Number Class

| Method               | Keterangan                   |
|----------------------|------------------------------|
| byte byteValue()     | Mengubah menjadi tipe byte   |
| double doubleValue() | Mengubah menjadi tipe double |
| float floatValue()   | Mengubah menjadi tipe float  |
| int intValue()       | Mengubah menjadi int value   |
| long longValue()     | Mengubah menjadi long value  |
| short shortValue()   | Mengubah menjadi short value |

## Konversi String ke Number

- Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke Number
- parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
- valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
- Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke Number

## Math Class

- Class Math merupakan class utilities yang berisikan banyak sekali static method untuk operasi numerik, seperti
  trigonometric, logarithm, akar pangkat dan lain-lain

## Mthod di Math Class

| Method                | Keterangan                      |
|-----------------------|---------------------------------|
| double cos(double)    | Menghitung cos di trigonometric |
| double sin(double)    | Menghitung sin di trigonometric |
| double tan(double)    | Menghitung tan di trigonometric |
| min(number1, number2) | Mengambil nilai terkecil        |
| max(number1, number2) | Mengambil nilai terbesar        |
| ...dan masih banyak   |         |

## Big Number

- Jika kita ada kebutuhan untuk menggunakan angkat yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah
  disediakan class untuk handle data besar tersebut
- BigInteger adalah class untuk handle tipe data Integer, dan
- BigDecimal adalah class untuk handle tipe data floating point

## Method di BigInteger & BigDecimal

| Method                   | Operator |
|--------------------------|---------|
| add                      | +       |
| subtract                 | -       |
| multiply                 | *       |
| divide                   | /       |
| mod                      | %       |
| ...dan masih banyak lagi |         |

## Scanner Class

- Scanner sebenarnya bagian dari Java IO(Input Output), dan ini akan dibahas di materi terpisah
- Namun sekarang kita akan bahas sekilas tentang class Scanner
- Class Scanner hadir sejak Java 5
- Class Scanner adalah class yang bisa digunakan untuk membaca input,entah dari file, console dan lain-lain
- Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program java
  menggunakan console / terminal

## Method di Scanner Class

| Method              | Keterangan      |
|---------------------|-----------------|
| nextLine()          | Membaca string  |
| nextInt()           | Membaca int     |
| nextLong()          | Membaca long    |
| nextBoolean()       | Membaca boolean |
| ...dan masih banyak |                 |

## Data & Calendar

- Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date & Calendar yang bisa
  kita gunakan sebagai representasi tanggal
- Sebenarnya di Java 8 suda ada cara manipulasi tanggal yang baru menggunakan Java Date Time Api, namun itu akan kita
  bahas di course terpisah
- Sekarang kita akan fokus menggunakan class Data dan Calendar

## Hubungan Data dan Calendar

- Class Date adalah class representasi tanggal sampai presisi milisecond
- Namun di class Date sudah banyak method-method yang di deprecated, sehingga untuk memanipulasi date tanggal, kita
  sekarang harus melakukan kombinasi antara class Date dan Calendar
- Sederhananya Date untuk representasi tanggal dan Calendar untuk memanipulasi tanggal

## System Class

- Class System adalah class yang berisikan banyak utility static method di Java, contohnya sebelumnya kita sudah sering
  menggunakan method println milik field out di class System.

## Method di System Class

| Method                   | Keterangan                                      |
|--------------------------|-------------------------------------------------|
| String getenv(key)       | Mendapatkan environment variable sistem operasi |
| void exit(status)        | Menghentikan program Java                       |
| long currentTimeMilis()  | Mendapatkan waktu saat ini dalam milisecond     |
| long nanoTime()          | Mendapatkan waktu saat ini dalam nanosecond     |
| void gc()                | Menjalankan Java garbage collection             |
| ...dan masih banyak lagi |              |

## Runtime Class

- Ketika aplikasi Java kita berjalan kita bisa melihat informasi environment tempat aplikasi Java berjalan
- Informasi itu terdapat di class Runtime.
- Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut
  menggunakan static method getRuntime() milik class Runtime

## Method di Runtime Class

| Method                    | Keterangan                                                                                 |
|---------------------------|--------------------------------------------------------------------------------------------|
| int availableProcessors() | Mendapatkan jumlah core cpu                                                                |
| long freeMemory()         | Mendapatkan jumlah memory bebas di JVM                                                     |
| long totalMemory()        | Mendapatkan jumlah total memory di JVM                                                     |
| long maxMemory()          | Mendapatkan jumlah maksimum memory di JVM                                                  |
| void gc()                 | Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai |

## UUID Class

- Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key
  misalnya
- Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
- UUID adalah format standard untuk membuat unique value yang telah terjamin

## Base64 Class

- Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding bas64
- Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk mengubah binary data ke text
  yang aman
- Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing

## Objects Class

- Awas jangan tertukar, ini class Objects bukan Object
- Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau
  melakukan pengecekan sebelum operasinya dilakukan

