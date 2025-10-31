# Alzajeera News App

![Alzajeera News App](https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified1.jpg)

A modern Android news application built with Kotlin and Jetpack Compose that fetches and displays
the latest news articles from NewsAPI.org.

## Features

- 📱 Modern UI with Jetpack Compose and Material 3 Design
- 📰 Real-time news feed from NewsAPI.org
- 🔄 Pull to refresh functionality
- 🖼️ Image loading with Coil
- 🌐 Network error handling and retry mechanism
- 📱 Responsive design for all screen sizes
- 🎨 Custom app icon with newspaper theme
- 📷 Custom images in drawable resources

## Screenshots

| Home Screen                                                                                                           | News Article     |
|-----------------------------------------------------------------------------------------------------------------------|------------------|
| ![Home Screen](https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified2.jpg) | ![News Detail](https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified3.jpg) |

## Images

The app includes custom images in the drawable resources:

- `home_image.jpg` - Main home screen background
- `screen_image.jpg` - Additional screen imagery

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit
- **Image Loading**: Coil
- **Dependency Injection**: None (manual DI)
- **Asynchronous Programming**: Kotlin Coroutines

## Architecture

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/alzajeeraapp/
│   │   │   ├── model/           # Data classes and API service
│   │   │   ├── view/            # Compose UI components
│   │   │   ├── viewmodel/       # ViewModel for UI logic
│   │   │   ├── ui/theme/        # Compose theme definitions
│   │   │   └── MainActivity.kt
│   │   ├── res/                 # Resources (drawables, values, etc.)
│   │   └── AndroidManifest.xml
```

## Dependencies

- `androidx.core:core-ktx`
- `androidx.lifecycle:lifecycle-runtime-ktx`
- `androidx.activity:activity-compose`
- `androidx.compose.ui:ui`
- `androidx.compose.ui:ui-tooling-preview`
- `androidx.compose.material3:material3`
- `com.squareup.retrofit2:retrofit`
- `com.squareup.retrofit2:converter-gson`
- `io.coil-kt:coil-compose`

## Getting Started

### Prerequisites

- Android Studio Flamingo or later
- Kotlin 1.8.0 or later
- Android Gradle Plugin 8.9.1 or later
- Gradle 8.11.1 or later

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/DAlgoSculptor/Alzajeera-News-App.git
   ```

2. Open the project in Android Studio

3. Add your NewsAPI.org key in `NewsRepository.kt`:
   ```kotlin
   private val apiKey = "YOUR_API_KEY_HERE"
   ```

4. Build and run the project

## API Integration

The app uses NewsAPI.org for fetching news articles. You need to sign up for a free API key
at [NewsAPI.org](https://newsapi.org/).

### Endpoints Used

- `GET /v2/top-headlines` - Fetch top news headlines

## Project Structure

```
com.example.alzajeeraapp
├── model
│   ├── NewsArticle.kt
│   ├── NewsResponse.kt
│   └── NewsApiService.kt
├── view
│   └── NewsScreen.kt
├── viewmodel
│   └── NewsViewModel.kt
├── ui
│   └── theme
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
└── MainActivity.kt
```

## Key Components

### NewsScreen.kt

The main Compose UI that displays:

- Loading indicators
- News articles in a scrollable list
- Error states with retry functionality
- Pull-to-refresh capability

### NewsViewModel.kt

Handles:

- UI state management
- API calls through the repository
- Error handling
- Loading states

### NewsRepository.kt

Responsible for:

- Making API calls
- Handling network responses
- Providing data to the ViewModel

### NewsApiService.kt

Retrofit interface that defines:

- API endpoints
- Request parameters
- Response types

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Danish Nawaz - [@DAlgoSculptor](https://github.com/DAlgoSculptor)

Project
Link: [https://github.com/DAlgoSculptor/Alzajeera-News-App](https://github.com/DAlgoSculptor/Alzajeera-News-App)