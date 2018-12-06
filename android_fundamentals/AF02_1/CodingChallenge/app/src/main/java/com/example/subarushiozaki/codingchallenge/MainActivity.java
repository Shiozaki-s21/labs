package com.example.subarushiozaki.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    public static final String TITLE = "TITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchFirstText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "During the Federal war in the United States a new and very influential\n" +
                "club was established in the city of Baltimore, Maryland. It is well\n" +
                "known with what energy the military instinct was developed amongst that\n" +
                "nation of shipowners, shopkeepers, and mechanics. Mere tradesmen jumped\n" +
                "their counters to become extempore captains, colonels, and generals\n" +
                "without having passed the Military School at West Point; they soon\n" +
                "rivalled their colleagues of the old continent, and, like them, gained\n" +
                "victories by dint of lavishing bullets, millions, and men.\n" +
                "\n" +
                "But where Americans singularly surpassed Europeans was in the science of\n" +
                "ballistics, or of throwing massive weapons by the use of an engine; not\n" +
                "that their arms attained a higher degree of perfection, but they were of\n" +
                "unusual dimensions, and consequently of hitherto unknown ranges. The\n" +
                "English, French, and Prussians have nothing to learn about flank,\n" +
                "running, enfilading, or point-blank firing; but their cannon, howitzers,\n" +
                "and mortars are mere pocket-pistols compared with the formidable engines\n" +
                "of American artillery.\n" +
                "\n" +
                "This fact ought to astonish no one. The Yankees, the first mechanicians\n" +
                "in the world, are born engineers, just as Italians are musicians and\n" +
                "Germans metaphysicians. Thence nothing more natural than to see them\n" +
                "bring their audacious ingenuity to bear on the science of ballistics.\n" +
                "Hence those gigantic cannon, much less useful than sewing-machines, but\n" +
                "quite as astonishing, and much more admired. The marvels of this style\n" +
                "by Parrott, Dahlgren, and Rodman are well known. There was nothing left\n" +
                "the Armstrongs, Pallisers, and Treuille de Beaulieux but to bow before\n" +
                "their transatlantic rivals.\n" +
                "\n" +
                "Therefore during the terrible struggle between Northerners and\n" +
                "Southerners, artillerymen were in great request; the Union newspapers\n" +
                "published their inventions with enthusiasm, and there was no little\n" +
                "tradesman nor _naïf_ \"booby\" who did not bother his head day and night\n" +
                "with calculations about impossible trajectory engines.\n" +
                "\n" +
                "Now when an American has an idea he seeks another American to share it.\n" +
                "If they are three, they elect a president and two secretaries. Given\n" +
                "four, they elect a clerk, and a company is established. Five convoke a\n" +
                "general meeting, and the club is formed. It thus happened at Baltimore.\n" +
                "The first man who invented a new cannon took into partnership the first\n" +
                "man who cast it and the first man that bored it. Such was the nucleus of\n" +
                "the Gun Club. One month after its formation it numbered eighteen hundred\n" +
                "and thirty-three effective members, and thirty thousand five hundred and\n" +
                "seventy-five corresponding members.\n" +
                "\n" +
                "One condition was imposed as a _sine quâ non_ upon every one who wished\n" +
                "to become a member--that of having invented, or at least perfected, a\n" +
                "cannon; or, in default of a cannon, a firearm of some sort. But, to tell\n" +
                "the truth, mere inventors of fifteen-barrelled rifles, revolvers, or\n" +
                "sword-pistols did not enjoy much consideration. Artillerymen were always\n" +
                "preferred to them in every circumstance.\n" +
                "\n" +
                "\"The estimation in which they are held,\" said one day a learned orator\n" +
                "of the Gun Club, \"is in proportion to the size of their cannon, and in\n" +
                "direct ratio to the square of distance attained by their projectiles!\"\n" +
                "\n" +
                "A little more and it would have been Newton's law of gravitation applied\n" +
                "to moral order.";
        String title = "Moon Voyage";
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(TITLE, title);

        startActivity(intent);
    }

    public void launchSecondText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "THE YEAR 1866 was marked by a bizarre development, an unexplained\n" +
                "and downright inexplicable phenomenon that surely no one has forgotten.\n" +
                "Without getting into those rumors that upset civilians\n" +
                "in the seaports and deranged the public mind even far inland,\n" +
                "it must be said that professional seamen were especially alarmed.\n" +
                "Traders, shipowners, captains of vessels, skippers, and master mariners\n" +
                "from Europe and America, naval officers from every country, and at\n" +
                "their heels the various national governments on these two continents,\n" +
                "were all extremely disturbed by the business.\n" +
                "\n" +
                "In essence, over a period of time several ships had encountered\n" +
                "\"an enormous thing\" at sea, a long spindle-shaped object,\n" +
                "sometimes giving off a phosphorescent glow, infinitely bigger\n" +
                "and faster than any whale.\n" +
                "\n" +
                "The relevant data on this apparition, as recorded in various logbooks,\n" +
                "agreed pretty closely as to the structure of the object or creature\n" +
                "in question, its unprecedented speed of movement, its startling\n" +
                "locomotive power, and the unique vitality with which it seemed\n" +
                "to be gifted.  If it was a cetacean, it exceeded in bulk any whale\n" +
                "previously classified by science.  No naturalist, neither Cuvier nor\n" +
                "Lacépčde, neither Professor Dumeril nor Professor de Quatrefages,\n" +
                "would have accepted the existence of such a monster sight unseen--\n" +
                "specifically, unseen by their own scientific eyes.\n" +
                "\n" +
                "Striking an average of observations taken at different times--\n" +
                "rejecting those timid estimates that gave the object a length\n" +
                "of 200 feet, and ignoring those exaggerated views that saw it\n" +
                "as a mile wide and three long--you could still assert that this\n" +
                "phenomenal creature greatly exceeded the dimensions of anything\n" +
                "then known to ichthyologists, if it existed at all.\n" +
                "\n" +
                "Now then, it did exist, this was an undeniable fact; and since\n" +
                "the human mind dotes on objects of wonder, you can understand\n" +
                "the worldwide excitement caused by this unearthly apparition.\n" +
                "As for relegating it to the realm of fiction, that charge had\n" +
                "to be dropped.\n" +
                "\n" +
                "In essence, on July 20, 1866, the steamer Governor Higginson,\n" +
                "from the Calcutta & Burnach Steam Navigation Co., encountered this\n" +
                "moving mass five miles off the eastern shores of Australia.\n" +
                "\n" +
                "Captain Baker at first thought he was in the presence of an unknown reef;\n" +
                "he was even about to fix its exact position when two waterspouts\n" +
                "shot out of this inexplicable object and sprang hissing into the air\n" +
                "some 150 feet.  So, unless this reef was subject to the intermittent\n" +
                "eruptions of a geyser, the Governor Higginson had fair and honest\n" +
                "dealings with some aquatic mammal, until then unknown, that could\n" +
                "spurt from its blowholes waterspouts mixed with air and steam.\n";
        intent.putExtra(EXTRA_MESSAGE, message);
        String title = "20000 Leagues Under the Sea";
        intent.putExtra(TITLE, title);


        startActivity(intent);
    }

    public void launchThirdText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "IN THE YEAR 2889.\n" +
                "\n" +
                "Little though they seem to think of it, the people of this twenty-ninth\n" +
                "century live continually in fairyland. Surfeited as they are with\n" +
                "marvels, they are indifferent in presence of each new marvel. To them\n" +
                "all seems natural. Could they but duly appreciate the refinements of\n" +
                "civilization in our day; could they but compare the present with the\n" +
                "past, and so better comprehend the advance we have made! How much fairer\n" +
                "they would find our modern towns, with populations amounting sometimes\n" +
                "to 10,000,000 souls; their streets 300 feet wide, their houses 1000 feet\n" +
                "in height; with a temperature the same in all seasons; with their lines\n" +
                "of aërial locomotion crossing the sky in every direction! If they would\n" +
                "but picture to themselves the state of things that once existed, when\n" +
                "through muddy streets rumbling boxes on wheels, drawn by horses--yes, by\n" +
                "horses!--were the only means of conveyance. Think of the railroads of\n" +
                "the olden time, and you will be able to appreciate the pneumatic tubes\n" +
                "through which to-day one travels at the rate of 1000 miles an hour.\n" +
                "Would not our contemporaries prize the telephone and the telephote more\n" +
                "highly if they had not forgotten the telegraph?\n" +
                "\n" +
                "Singularly enough, all these transformations rest upon principles which\n" +
                "were perfectly familiar to our remote ancestors, but which they\n" +
                "disregarded. Heat, for instance, is as ancient as man himself;\n" +
                "electricity was known 3000 years ago, and steam 1100 years ago. Nay, so\n" +
                "early as ten centuries ago it was known that the differences between the\n" +
                "several chemical and physical forces depend on the mode of vibration of\n" +
                "the etheric particles, which is for each specifically different. When at\n" +
                "last the kinship of all these forces was discovered, it is simply\n" +
                "astounding that 500 years should still have to elapse before men could\n" +
                "analyze and describe the several modes of vibration that constitute\n" +
                "these differences. Above all, it is singular that the mode of\n" +
                "reproducing these forces directly from one another, and of reproducing\n" +
                "one without the others, should have remained undiscovered till less than\n" +
                "a hundred years ago. Nevertheless, such was the course of events, for it\n" +
                "was not till the year 2792 that the famous Oswald Nier made this great\n" +
                "discovery.\n" +
                "\n" +
                "Truly was he a great benefactor of the human race. His admirable\n" +
                "discovery led to many another. Hence is sprung a pleiad of inventors,\n" +
                "its brightest star being our great Joseph Jackson. To Jackson we are\n" +
                "indebted for those wonderful instruments the new accumulators. Some of\n" +
                "these absorb and condense the living force contained in the sun's rays;\n" +
                "others, the electricity stored in our globe; others again, the energy\n" +
                "coming from whatever source, as a waterfall, a stream, the winds, etc.\n" +
                "He, too, it was that invented the transformer, a more wonderful\n" +
                "contrivance still, which takes the living force from the accumulator,\n" +
                "and, on the simple pressure of a button, gives it back to space in\n" +
                "whatever form may be desired, whether as heat, light, electricity, or\n" +
                "mechanical force, after having first obtained from it the work required.\n" +
                "From the day when these two instruments were contrived is to be dated\n" +
                "the era of true progress. They have put into the hands of man a power\n" +
                "that is almost infinite. As for their applications, they are numberless.\n" +
                "Mitigating the rigors of winter, by giving back to the atmosphere the\n" +
                "surplus heat stored up during the summer, they have revolutionized\n" +
                "agriculture. By supplying motive power for aërial navigation, they have\n" +
                "given to commerce a mighty impetus. To them we are indebted for the\n" +
                "continuous production of electricity without batteries or dynamos, of\n" +
                "light without combustion or incandescence, and for an unfailing supply\n" +
                "of mechanical energy for all the needs of industry.";
        String title = "In the Year 2889";

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(TITLE, title);

        startActivity(intent);
    }
}
