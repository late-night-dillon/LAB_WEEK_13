# LAB_WEEK_12 – Movie List App (Coroutines & Flow)

Mobile app sederhana untuk menampilkan daftar film populer menggunakan **The Movie Database (TMDB) API**.  
Project ini dibuat sebagai bagian dari **LAB Week 12 – Coroutines & Flow** (MAP 2023/2024).

Aplikasi dibangun secara bertahap dalam 3 commit utama:

1. **Commit No. 1 – Init template**  
2. **Commit No. 2 – Building app with coroutines**  
3. **Commit No. 3 – Migrating to Flow (StateFlow) + Data Filtering**

---

## Tech Stack

- **Kotlin**
- **AndroidX**
- **Coroutines** (`kotlinx.coroutines`)
- **Retrofit** + **Moshi Converter**
- **StateFlow** (Kotlin Flow)
- **RecyclerView + GridLayoutManager**
- **Glide** (image loading)

---

## Fitur Utama

- Menampilkan **daftar film populer** dari TMDB.
- Menampilkan **detail film** ketika item di klik (judul, tanggal rilis, overview, poster).
- Menggunakan:
  - **Coroutines** untuk network call non-blocking.
  - **Flow / StateFlow** untuk streaming data ke UI.
- **Filtering & sorting**:
  - Hanya film dengan `release_date` yang mulai dengan **tahun berjalan**.
  - Diurutkan **descending berdasarkan popularity**.

---

## Screenshot

Contoh struktur:

- Halaman utama (grid daftar film)
  <img width="1919" height="1015" alt="commit3 (1)" src="https://github.com/user-attachments/assets/60a826cb-95d0-4903-9276-16a9648b708c" />

- Halaman detail film
  <img width="1919" height="1023" alt="commit3 (2)" src="https://github.com/user-attachments/assets/a2f111af-34bb-4819-815c-2b339030929c" />


---

## Setup & Konfigurasi

### 1. Clone repository

```bash
git clone https://github.com/<username>/<repo-name>.git
cd <repo-name>
