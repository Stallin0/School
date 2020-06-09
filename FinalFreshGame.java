import java.util.Scanner;
public class FinalFreshGame {
    public static int MonLevel;
    public static int[] HeroStats = {20, 10, 10, 10};
    public static int[] MonBaseStats = {5, 2, 2, 2};
    public static int[] costH = {5, 20, 25, 30, 50};
    public static int[] costB = {5, 20, 25, 30, 50};
    public static Scanner r = new Scanner(System.in);
    public static int MonCount = 0;
    public static int exp = 0;
    public static int gold = 0;
    public static int threshold = 2;
    public static void main(String[]args) {
        int x = 1;
        int devil = 0;
        while (devil == 0) {
            //setting and story set-up
            System.out.println("Welcome to the land of Albion where monsters have overrun civilization.\nIt is your job to save the land from the chaotic source of power that has brought the horrors in.");
            System.out.println("(to select your choice type the first letter of your choice in. This is true for all aspects except the show where a number is necessary instead)");
            while (HeroStats[0] > 0) {
                //exp system
                if (exp >= threshold) {
                    System.out.println("You Leveled up!");
                    for (int g = 0; g < MonBaseStats.length; g++) {
                        //health is the most important
                        HeroStats[0]++;
                        HeroStats[g]++;
                    }
                    threshold *= 1.5;
                }
                System.out.println("quest, shop or quit?");
                String a = r.nextLine();
                //if statements to decide where to go
                if (a.equals("q")) {
                    //determines the worlds that are available
                    if (x > 1) {
                        System.out.print("What world?");
                        int w = r.nextInt();
                        if (w == 1) {
                            //decides what level, name, and drops the monster will give for all worlds
                            if (MonCount >= 10) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 10;
                                    System.out.println("Grand Slime: ... ");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Grand Slime");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 1;
                                    if (MonLevel <= 5) {
                                        System.out.println("lesser Slime");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser Slime");
                                    } else if (MonLevel > 5) {
                                        System.out.println("Greater Slime");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater Slime");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 1;
                                if (MonLevel <= 5) {
                                    System.out.println("lesser Slime");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser Slime");
                                } else if (MonLevel > 5) {
                                    System.out.println("Greater Slime");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater Slime");
                                }
                            }
                        } else if (w == 2) {
                            if (MonCount >= 20) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 20;
                                    System.out.println("Grand Tree Patriarch: You must be punished for the death of NATURE! ");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Grand Tree Patriarch");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 11;
                                    if (MonLevel <= 15) {
                                        System.out.println("lesser Treant");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser Treant");
                                    } else if (MonLevel > 15) {
                                        System.out.println("Greater Treant");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater Treant");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 11;
                                if (MonLevel <= 15) {
                                    System.out.println("lesser Treant");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser Treant");
                                } else if (MonLevel > 15) {
                                    System.out.println("Greater Treant");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater Treant");
                                }
                            }
                        } else if (w == 3) {
                            if (MonCount >= 30) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 30;
                                    System.out.println("Grand Dark Crystal Golem: Your blood shall stain my crystals red forever ");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Grand Dark Crystal Golem");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 21;
                                    if (MonLevel <= 25) {
                                        System.out.println("lesser stone golem");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser stone golem");
                                    } else if (MonLevel > 25) {
                                        System.out.println("Greater iron golem");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater iron golem");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 21;
                                if (MonLevel <= 25) {
                                    System.out.println("lesser stone golem");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser stone golem");
                                } else if (MonLevel > 25) {
                                    System.out.println("Greater iron golem");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater iron golem");
                                }
                            }
                        } else if (w == 4) {
                            if (MonCount >= 40) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 40;
                                    System.out.println("Grand Diamond Construct: Let me show you the true meaning of a BLOOD diamond!");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Grand Diamond Construct");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 31;
                                    if (MonLevel <= 35) {
                                        System.out.println("lesser ruby golem");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser ruby golem");
                                    } else if (MonLevel > 35) {
                                        System.out.println("Greater sapphire golem ");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater sapphire golem");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 31;
                                if (MonLevel <= 35) {
                                    System.out.println("lesser ruby golem");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser ruby golem");
                                } else if (MonLevel > 35) {
                                    System.out.println("Greater sapphire golem");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater sapphire golem");
                                }
                            }
                        } else if (w == 5) {
                            if (MonCount >= 50) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 50;
                                    System.out.println("Deep Grand Undersea Kraken: I will break you like the many boats that have approached me before!");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Deep Grand Undersea Kraken");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 41;
                                    if (MonLevel <= 45) {
                                        System.out.println("lesser Undersea Merman");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser Undersea  Merman");
                                    } else if (MonLevel > 45) {
                                        System.out.println("greater Undersea Megalodon");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated greater Undersea Megalodon");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 41;
                                if (MonLevel <= 45) {
                                    System.out.println("lesser Undersea  Merman");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser Undersea  Merman");
                                } else if (MonLevel > 45) {
                                    System.out.println("greater Undersea Megalodon");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated greater Undersea Megalodon");
                                }
                            }
                        } else if (w == 6) {
                            if (MonCount >= 60) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 60;
                                    System.out.println("Grand Molten Greed Dragon: I will use your Bones as ToothPicks!");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Grand Molten Greed Dragon");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 51;
                                    if (MonLevel <= 55) {
                                        System.out.println("lesser lava drake");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser lava drake");
                                    } else if (MonLevel > 55) {
                                        System.out.println("Greater magma Wyvern");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater magma Wyvern");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 51;
                                if (MonLevel <= 55) {
                                    System.out.println("lesser lava drake");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser lava drake");
                                } else if (MonLevel > 55) {
                                    System.out.println("Greater magma Wyvern");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater magma Wyvern");
                                }
                            }
                        } else if (w == 7) {
                            if (MonCount >= 80) {
                                System.out.println("fight boss?  y/n ");
                                String b = r.nextLine();
                                if (b.equals("y")) {
                                    MonLevel = 75;
                                    System.out.println("Dark Underlord Lucifer");
                                    fight();
                                    x++;
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Dark Underlord Lucifer");
                                } else if (b.equals("n")) {
                                    MonLevel = (int) (Math.random() * 9) + 61;
                                    if (MonLevel <= 65) {
                                        System.out.println("lesser zombie");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated lesser zombie");
                                    } else if (MonLevel > 65) {
                                        System.out.println("Greater Skeleton");
                                        fight();
                                        MonCount++;
                                        gold += MonLevel;
                                        exp += MonLevel;
                                        System.out.println("You defeated Greater Skeleton");
                                    }
                                }
                            } else {
                                MonLevel = (int) (Math.random() * 9) + 61;
                                if (MonLevel <= 65) {
                                    System.out.println("lesser zombie");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated lesser zombie");
                                } else if (MonLevel > 65) {
                                    System.out.println("Greater Skeleton");
                                    fight();
                                    MonCount++;
                                    gold += MonLevel;
                                    exp += MonLevel;
                                    System.out.println("You defeated Greater Skeleton");
                                }
                            }
                        }
                    } else {
                        if (MonCount >= 10) {
                            System.out.println("fight boss?  y/n ");
                            String b = r.nextLine();
                            if (b.equals("y")) {
                                MonLevel = 10;
                                System.out.println("Grand Slime: ... ");
                                fight();
                                MonCount++;
                                gold += MonLevel;
                                exp += MonLevel;
                                System.out.println("You defeated Grand Slime");
                            }
                        } else {
                            MonLevel = (int) (Math.random() * 9) + 1;
                            if (MonLevel <= 5) {
                                System.out.println("lesser Slime");
                                fight();
                                MonCount++;
                                gold += MonLevel;
                                exp += MonLevel;
                                System.out.println("You defeated lesser Slime");
                            } else if (MonLevel > 5) {
                                System.out.println("Greater Slime");
                                fight();
                                MonCount++;
                                gold += MonLevel;
                                exp += MonLevel;
                                System.out.println("You defeated Greater Slime");
                            }
                        }

                    }
                }
                else if (a.equals("s")) {
                    System.out.println("Welcome to the store!");
                    System.out.println("What would you like: healing, buffing, or exit");
                    String s = r.nextLine();
                    if (s.equals("h")) {
                        // they use numbers to select the items
                        //these items heal the player
                        System.out.println("item names: [1] Slime Elixir, [2] Bark Band-aid, [3] Stone Soup, [4] Fish Scale Graft, [5] Blood of the Wyvern");
                        int i = r.nextInt();
                        if (i == 1) {
                            System.out.print("cost: " + costH[0]);
                            costH[0] *= 2;
                            HeroStats[0] += 5;
                        } else if (i == 2) {
                            System.out.print("cost: " + costH[1]);
                            costH[1] *= 2;
                            HeroStats[0] += 10;
                        } else if (i == 3) {
                            System.out.print("cost: " + costH[2]);
                            costH[2] *= 2;
                            HeroStats[0] += 20;
                        } else if (i == 4) {
                            System.out.print("cost: " + costH[3]);
                            costH[3] *= 2;
                            HeroStats[0] += 25;
                        } else if (i == 5) {
                            System.out.print("cost: " + costH[4]);
                            costH[4] *= 2;
                            HeroStats[0] += 40;
                        } else if (s.equals("b")) {
                            //these items buff the player
                            System.out.println("item names: [1] ");
                            int l = r.nextInt();
                            if (l == 1) {
                                System.out.print("cost: " + costB[0]);
                                costB[0] *= 2;
                                HeroStats[1] += 5;
                            } else if (l == 2) {
                                System.out.print("cost: " + costB[0]);
                                costB[0] *= 2;
                                HeroStats[2] += 10;
                            } else if (l == 3) {
                                System.out.print("cost: " + costB[0]);
                                costB[0] *= 2;
                                HeroStats[1] += 15;
                            } else if (l == 4) {
                                System.out.print("cost: " + costB[0]);
                                costB[0] *= 2;
                                HeroStats[1] += 30;
                            } else if (l == 5) {
                                System.out.print("cost: " + costB[0]);
                                costB[0] *= 2;
                                HeroStats[1] += 25;
                            }
                        }

                        if (s.equals("e")) {
                            break;
                        }
                    }
                }
                else if (a.equals("qq")) {
                    //ends both while loops so that code may end
                    HeroStats[0] -= 10000000;
                    devil++;
                }
            }
        }
    }
    private static void fight() {
        //this is my fight method
        int dmg = 0;
        int Mdmg = 0;
        System.out.println("Level: " + MonLevel);
        //gives the monster more unbalanced stats
        for (int y = 0; y < MonBaseStats.length; y++) {
            MonBaseStats[y] = (int) (Math.random() * 3);
        }
        //adds the level to the stats
        for (int i = 0; i < MonBaseStats.length; i++) {
            MonBaseStats[i] += MonLevel;
        }
        //this is player turn
        while (MonBaseStats[0] >= 0) {
            System.out.print("strike, magic, or run? ");
            String o = r.nextLine();
            if (o.equals("r")) {
                return;
            } else if (o.equals("s")) {
                dmg = HeroStats[1] - MonBaseStats[1];
                MonBaseStats[0] -= dmg;
                System.out.println("you deal  " + dmg + " damage");
                //monster's turn
                int Mon = (int) (Math.random() * 2) + 1;
                if (Mon >= 2) {
                    Mdmg = MonBaseStats[1] - HeroStats[1];
                    HeroStats[0] -= Mdmg;
                    System.out.println("Monster deals " + Mdmg + " damage");
                } else {
                    Mdmg = MonBaseStats[2] - HeroStats[2];
                    HeroStats[0] -= Mdmg;
                    System.out.println("Monster deals " + Mdmg + " damage");
                }

            } else if (o.equals("m")) {
                dmg = HeroStats[2] - MonBaseStats[2];
                MonBaseStats[0] -= dmg;
                System.out.println("you deal " + dmg + " damage");
                //monster's turn
                int Mon = (int) (Math.random() * 2) + 1;
                if (Mon >= 2) {
                    Mdmg = MonBaseStats[1] - HeroStats[1];
                    HeroStats[0] -= Mdmg;
                    System.out.println("Monster deals " + Mdmg + " damage");
                } else {
                    Mdmg = MonBaseStats[2] - HeroStats[2];
                    HeroStats[0] -= Mdmg;
                    System.out.println("Monster deals " + Mdmg + " damage");
                }
            }
        }

    }
}

