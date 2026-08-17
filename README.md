# Flightscry

A mobile flight itinerary proof-of-concept built with [Backpack](https://backpack.github.io/), Skyscanner's Android UI library.

## Features

- Flight route header (LHR → JFK) with status badge
- Seat number highlight
- Passenger, gate, and baggage detail cards
- Accordion sections for meal preference, connections, and booking details

## Setup

1. Clone the repo
2. Open in Android Studio (Hedgehog or later)
3. Sync Gradle — Backpack `40.0.0` will be downloaded automatically
4. Run on an emulator or physical device (API 26+)

## Structure

```
app/src/main/
├── java/com/skyscanner/flightscry/
│   └── MainActivity.kt
└── res/
    ├── layout/
    │   ├── activity_main.xml   ← main itinerary screen
    │   └── item_detail_row.xml ← reusable key/value row
    └── values/
        ├── strings.xml
        └── themes.xml          ← extends BpkTheme
```

## Libraries

- [Backpack Android](https://github.com/Skyscanner/backpack-android) `40.0.0`
- AndroidX AppCompat, ConstraintLayout, Material Components
