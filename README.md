# LAB_WEEK_13 – Architecture Patterns

Project ini adalah lanjutan dari LAB_WEEK_12 untuk modul **Architecture Patterns** pada mata kuliah **Mobile Application Programming**. Aplikasi menampilkan daftar film populer dari TMDB API dan menerapkan:

- **MVVM (Model–View–ViewModel)**
- **Data Binding**
- **Repository Pattern + Room**
- **WorkManager**

## Arsitektur Singkat

- **Model (Data Layer)**
  - `Movie.kt` (Entity)
  - `MovieDao.kt`, `MovieDatabase.kt` (Room)
  - `MovieService.kt` (Retrofit API)
  - `MovieRepository.kt` (Repository, mengelola API + Room)

- **View (UI Layer)**
  - `MainActivity.kt`
  - `activity_main.xml` + layout item
  - `MovieAdapter.kt`
  - `RecyclerViewBinding.kt` (BindingAdapter)

- **ViewModel**
  - `MovieViewModel.kt`

## Fitur Utama

- Mengambil daftar film populer dari TMDB API.
- Menyimpan data film ke database lokal menggunakan Room (cache, bisa offline).
- Menampilkan data dengan RecyclerView menggunakan Data Binding.
- Menyegarkan data film secara periodik (setiap 1 jam) dengan WorkManager.

## Commit Utama

1. **Commit No. 1 – add data binding**  
   Menambahkan Data Binding di layout dan MainActivity.
  <img width="1919" height="1079" alt="commit1" src="https://github.com/user-attachments/assets/c2b005ec-1a5c-4061-98b5-6d8af7ed06c1" />

2. **Commit No. 2 – update to Room**  
   Menambahkan Room (Entity, DAO, Database) dan integrasi ke Repository.
   <img width="1919" height="1079" alt="commit2 (2)" src="https://github.com/user-attachments/assets/e9ccaa73-8982-427a-9a65-efdb4ab3ec4e" />
<img width="1919" height="1079" alt="commit2 (1)" src="https://github.com/user-attachments/assets/8e46aabf-0b17-4bbc-938a-238e57af281c" />


4. **Commit No. 3 – update to WorkManager**  
   Menambahkan MovieWorker dan penjadwalan PeriodicWorkRequest di MovieApplication.
   <img width="1919" height="1038" alt="commit3" src="https://github.com/user-attachments/assets/5ca05fc9-d88e-48c2-b9fe-e96038c3ed0e" />
  
6. **Commit No. 4 – assignment**  
   Menambahkan file `LAB_WEEK_13.txt` berisi jawaban pertanyaan modul.
