package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Badge;
import com.xworkz.overriding.internal.BrownBear;

public class BadgeRunner {
    public static void main(String[] args) {
        Badge badge = new Badge();
        badge.describe();

        BrownBear rangerBadge = new BrownBear();
        rangerBadge.describe();
        rangerBadge.growl();

        Badge wildlifeID = new BrownBear();
        wildlifeID.describe();
    }
}
