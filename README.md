# Splash-Screen
Splash Screen with Animation


# Java 

``` 
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

```
 val animation = AnimationUtils.loadAnimation(this, R.anim.splashtransition)

        binding.splashImage.startAnimation(animation)
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1200)
```

Article :
- [5 ways to implement a splash screen
 ](https://medium.com/swlh/splash-screen-in-android-8ab250e40190)
