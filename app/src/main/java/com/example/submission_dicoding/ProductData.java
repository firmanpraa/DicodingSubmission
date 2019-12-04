package com.example.submission_dicoding;

import java.util.ArrayList;

public class ProductData {
    public static String[] productName = {
            "Vans Checkerboard Slip-On",
            "Reebok Classic Leather",
            "Adidas Stan Smith",
            "Nike Air Force 1",
            "Reebok Aztrek Men’s Leisure ",
            "Converse One Star",
            "Adidas NMD_R1",
            "New Balance 247",
            "Converse Jack Purcell",
            "Adidas Ultraboost 19",
    };

    private static String[] productDetails = {
            "The Classic Slip-On has a low profile, slip-on canvas upper with all-over checker print, elastic side accents, Vans flag label and Vans original Waffle Outsole.",
            "Never go out of style. Soft leather upper gives you superior comfort. Die-cut EVA midsole provides lightweight cushioning. Molded PU sockliner adds comfort and durability.",
            "Back in the day, Stan Smith won big on the tennis court. The shoe that bears his name has been winning on the streets ever since. Top to bottom, these shoes capture the essential style of the 1972 original, with the artful leather build, low-profile cupsole and clean trim that have always been its hallmark.",
            "The legend lives on in the Nike Air Force 1 '07, a modern take on the iconic AF-1 that blends classic style and fresh details.",
            "Flashback to the '90s. These boys' shoes have all the classic details, including an asymmetrical look on the synthetic suede and textile upper. Hexalite technology softens impact. The durable, diamond-studded outsole stands up to all his outdoor adventuring.",
            "Since its groundbreaking debut in 1974, the Converse One Star sneaker has been adopted and owned by the independents. We've optimized the bold 90's edition with sport utility features like tonal canvas and star details, clean white midsoles, a snugger fit, and a cushioned OrthoLite insole. The legend lives.",
            "The NMD_R1 rewrites the rules with a forward-thinking design that's rooted in adidas' best running technologies. These shoes pair a textile upper with a sock-like fit for a light, comfortable feel. Molded EVA inserts complement the responsive Boost midsole.",
            "A unique and versatile NB lifestyle shoe designed for your 247 style. The new 247 for men takes inspiration from the v1 and pushes style even further. It offers comfort and support in colors from bare to bold.",
            "Bring some polish to your holiday style with the Jack Purcell Jack oxford sneaker. Enjoy strong seasonal touches like a premium leather upper, tonal design and color-popped eyelet. ",
            "Ultraboost reinvented. These running shoes reboot key performance technologies to give you a confident and energy-filled run. The knit upper has a second-skin fit and is built with motion-weave technology for adaptive stretch and support.",
    };

    public static String[] productPrice = {
            "$409",
            "$230",
            "$435",
            "$256",
            "$667",
            "$235",
            "$547",
            "$675",
            "$764",
            "$356",

    };

    private static int[] productImages = {
            R.drawable.shoes_01,
            R.drawable.shoes_02,
            R.drawable.shoes_03,
            R.drawable.shoes_04,
            R.drawable.shoes_05,
            R.drawable.shoes_06,
            R.drawable.shoes_07,
            R.drawable.shoes_08,
            R.drawable.shoes_09,
            R.drawable.shoes_10
    };

    static ArrayList<Product> getListData() {
        ArrayList<Product> list = new ArrayList<>();
        for (int position = 0; position < productName.length; position++) {
            Product pd = new Product();
            pd.setName(productName[position]);
            pd.setPrice(productPrice[position]);
            pd.setDetail(productDetails[position]);
            pd.setPhoto(productImages[position]);
            list.add(pd);
        }
        return list;
    }
}
