# Splash-Screen



### using splash screen Api

**After adding splash dependency**

```kotlin
<style name="Theme.App.Starting" parent="Theme.SplashScreen">
   <!-- Set the splash screen background, animated icon, and animation duration. -->
   <item name="windowSplashScreenBackground">@color/...</item>

   <!-- Use windowSplashScreenAnimatedIcon to add either a drawable or an
        animated drawable. One of these is required. -->
   <item name="windowSplashScreenAnimatedIcon">@drawable/...</item>
   <!-- Required for animated icons -->
   <item name="windowSplashScreenAnimationDuration">200</item>

   <!-- Set the theme of the Activity that directly follows your splash screen. -->
   <!-- Required -->
   <item name="postSplashScreenTheme">@style/Theme.App</item>
</style>
```
**and change the theme in the mainfest in application**

Another Way -> Animation


# Java 

``` java
        ImageView img = findViewById(R.id.img);
        
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splashtransition);
        img.startAnimation(animation);
        
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000); 
```


# Kotlin

``` kotlin
 val animation = AnimationUtils.loadAnimation(this, R.anim.splashtransition)

        binding.splashImage.startAnimation(animation)
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1200)
```

## Fragment

``` kotlin

      val animation = AnimationUtils.loadAnimation(context, R.anim.splash_transition)

      binding.splashImage.startAnimation(animation)
        val handler = Handler()
        handler.postDelayed({
            val action = SplashScreenFragmentDirections.actionSplashScreenFragmentToHomeFragment()
            findNavController().navigate(action)
        }, 2000)
    }

```



Article :
- [5 ways to implement a splash screen](https://medium.com/swlh/splash-screen-in-android-8ab250e40190)
