//package com.some.notes.Model;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class SampleDataProvider {
//
//    public static List<CityDataItem> cityDataItemList;
//    public static Map<String,CityDataItem> dataItemMap;
//
//   static {
//        cityDataItemList =new ArrayList<>();
//        dataItemMap = new HashMap<>();
//
//       addItem(new CityDataItem("Hi","Hi."));
//
//       addItem(new CityDataItem("Hi aap kese hai","Hi how are  you."));
//
//       addItem(new CityDataItem("Hi how are you.","Hi how are you."));
//
//       addItem(new CityDataItem("Hi Good Morning.","Hi Good Morning."));
//
//       addItem(new CityDataItem("Hi Good Afternoon.","Hi Good Afternoon."));
//
//       addItem(new CityDataItem("Hi Good Evening.","Hi Good Evening."));
//
//       addItem(new CityDataItem("Hi aap kon.","Hi who are you."));
//
//       addItem(new CityDataItem("Hi aap kya kar rhe hai.","Hi what are you doing."));
//
//       addItem(new CityDataItem("main bor ho raha hoon.","I'm bored. "));
//
//       addItem(new CityDataItem("main bor ho raha hoon.","englis"));
//
//       addItem(new CityDataItem("main kangaal hoon.","I'm broke."));
//
//       addItem(new CityDataItem("main thak gaya hoon.","I'm tired."));
//
//       addItem(new CityDataItem("Well ","Well"));
//
//       addItem(new CityDataItem("main ","as"));
//
//       addItem(new CityDataItem("unake ","his"));
//
//       addItem(new CityDataItem("me ","I"));
//
//       addItem(new CityDataItem("us ","that"));
//
//       addItem(new CityDataItem("vah ","he"));
//
//       addItem(new CityDataItem("tha ","was"));
//
//       addItem(new CityDataItem("ke liye ","for"));
//
//       addItem(new CityDataItem("par ","on"));
//
//       addItem(new CityDataItem("kar rahe hain ","are"));
//
//       addItem(new CityDataItem("saath mein ","with"));
//
//       addItem(new CityDataItem("be ","they"));
//
//       addItem(new CityDataItem("hona ","be"));
//
//       addItem(new CityDataItem("par ","at"));
//
//       addItem(new CityDataItem("1 ","one"));
//
//       addItem(new CityDataItem("hai ","have"));
//
//       addItem(new CityDataItem("se ","from"));
//
//       addItem(new CityDataItem("yah ","this"));
//
//       addItem(new CityDataItem("dvaara ","by"));
//
//       addItem(new CityDataItem("garam ","hot"));
//
//       addItem(new CityDataItem("shabd ","word"));
//
//       addItem(new CityDataItem("parantu ","but"));
//
//       addItem(new CityDataItem("kya ","what"));
//
//       addItem(new CityDataItem("kuchh ","some"));
//
//       addItem(new CityDataItem("hai ","is"));
//
//       addItem(new CityDataItem("yah ","it"));
//
//       addItem(new CityDataItem("aap ","you"));
//
//       addItem(new CityDataItem("ya ","or"));
//
//       addItem(new CityDataItem("tha ","had"));
//
//       addItem(new CityDataItem("ka ","of"));
//
//       addItem(new CityDataItem("seva ","to"));
//
//       addItem(new CityDataItem("tatha ","and"));
//
//       addItem(new CityDataItem("Well ","a"));
//
//       addItem(new CityDataItem("mein ","in"));
//
//       addItem(new CityDataItem("ham ","we"));
//
//       addItem(new CityDataItem("kar sakate hain ","can"));
//
//       addItem(new CityDataItem("baahar ","out"));
//
//       addItem(new CityDataItem("any ","other"));
//
//       addItem(new CityDataItem("the ","were"));
//
//       addItem(new CityDataItem("kaun kaun se ","which"));
//
//       addItem(new CityDataItem("kar ","do"));
//
//       addItem(new CityDataItem("jo apane ","their"));
//
//       addItem(new CityDataItem("samay ","time"));
//
//       addItem(new CityDataItem("agar ","if"));
//
//       addItem(new CityDataItem("marjee ","will"));
//
//       addItem(new CityDataItem("kis tarah ","how"));
//
//       addItem(new CityDataItem("kaha hua ","said"));
//
//       addItem(new CityDataItem("ek ","an"));
//
//       addItem(new CityDataItem("se pratyek ","each"));
//
//       addItem(new CityDataItem("kahana ","tell"));
//
//       addItem(new CityDataItem("kar deta hai ","does"));
//
//       addItem(new CityDataItem("set ","set"));
//
//       addItem(new CityDataItem("teen ","three"));
//
//       addItem(new CityDataItem("chaahate hain ","want"));
//
//       addItem(new CityDataItem("vaayu ","air"));
//
//       addItem(new CityDataItem("kuna ","well"));
//
//       addItem(new CityDataItem("khel ","play"));
//
//       addItem(new CityDataItem("bhee ","also"));
//
//       addItem(new CityDataItem("Well ","play"));
//
//       addItem(new CityDataItem("chhota ","small"));
//
//       addItem(new CityDataItem("samaapt ","end"));
//
//       addItem(new CityDataItem("daal ","put"));
//
//       addItem(new CityDataItem("ghar ","home"));
//
//       addItem(new CityDataItem("padhana ","read"));
//
//       addItem(new CityDataItem("haath ","hand"));
//
//       addItem(new CityDataItem("bandaragaah ","port"));
//
//       addItem(new CityDataItem("vishaal ","large"));
//
//       addItem(new CityDataItem("jaadoo ","spell"));
//
//       addItem(new CityDataItem("jodana ","add"));
//
//       addItem(new CityDataItem("yahaan tak kee ","even"));
//
//       addItem(new CityDataItem("bhoomi ","land"));
//
//       addItem(new CityDataItem("yahaan ","here"));
//
//       addItem(new CityDataItem("jaroor ","must"));
//
//       addItem(new CityDataItem("bade ","big"));
//
//       addItem(new CityDataItem("uchch ","high"));
//
//       addItem(new CityDataItem("aisa ","such"));
//
//       addItem(new CityDataItem("ka paalan karen ","follow"));
//
//       addItem(new CityDataItem("kaary ","act"));
//
//       addItem(new CityDataItem("kyon ","why"));
//
//       addItem(new CityDataItem("poochhana ","ask"));
//
//       addItem(new CityDataItem("purushon ","men"));
//
//       addItem(new CityDataItem("parivartan ","change"));
//
//       addItem(new CityDataItem("chala gaya ","went"));
//
//       addItem(new CityDataItem("roshanee ","light"));
//
//       addItem(new CityDataItem("meharabaan ","kind"));
//
//       addItem(new CityDataItem("band ","off"));
//
//       addItem(new CityDataItem("jarurat ","need"));
//
//       addItem(new CityDataItem("makaan ","house"));
//
//       addItem(new CityDataItem("chitr ","picture"));
//
//       addItem(new CityDataItem("prayatn ","try"));
//
//       addItem(new CityDataItem("amerika ","us"));
//
//       addItem(new CityDataItem("phir ","again"));
//
//       addItem(new CityDataItem("jaanavar ","animal"));
//
//       addItem(new CityDataItem("bindu ","point"));
//
//       addItem(new CityDataItem("maan ","mother"));
//
//       addItem(new CityDataItem("vishv ","world"));
//
//       addItem(new CityDataItem("paas mein ","near"));
//
//       addItem(new CityDataItem("bild ","build"));
//
//       addItem(new CityDataItem("svayan ","self"));
//
//       addItem(new CityDataItem("dharatee ","earth"));
//
//       addItem(new CityDataItem("papa ","father"));
//
//       addItem(new CityDataItem("koee bhee ","any"));
//
//       addItem(new CityDataItem("naya ","new"));
//
//       addItem(new CityDataItem("kaam ","work"));
//
//       addItem(new CityDataItem("ansh ","part"));
//
//       addItem(new CityDataItem("lena ","take"));
//
//       addItem(new CityDataItem("praapt ","get"));
//
//       addItem(new CityDataItem("jagah ","place"));
//
//       addItem(new CityDataItem("banaaya gaya ","made"));
//
//       addItem(new CityDataItem("kahaan pe ","where"));
//
//       addItem(new CityDataItem("uparaant ","after"));
//
//       addItem(new CityDataItem("vaapas ","back"));
//
//       addItem(new CityDataItem("thoda ","little"));
//
//       addItem(new CityDataItem("keval ","only"));
//
//       addItem(new CityDataItem("gol ","round"));
//
//       addItem(new CityDataItem("aadamee ","man"));
//
//       addItem(new CityDataItem("saal ","year"));
//
//       addItem(new CityDataItem("aaya ","came"));
//
//       addItem(new CityDataItem("pradarshan ","show"));
//
//       addItem(new CityDataItem("har ek ","every"));
//
//       addItem(new CityDataItem("achchha ","good"));
//
//       addItem(new CityDataItem("mujhe ","me"));
//
//       addItem(new CityDataItem("dena ","give"));
//
//       addItem(new CityDataItem("hamaaree ","our"));
//
//       addItem(new CityDataItem("ke antargat ","under"));
//
//       addItem(new CityDataItem("naam ","name"));
//
//       addItem(new CityDataItem("bahut ","very"));
//
//       addItem(new CityDataItem("ke maadhyam se ","through"));
//
//       addItem(new CityDataItem("keval ","just"));
//
//       addItem(new CityDataItem("prapatr ","form"));
//
//       addItem(new CityDataItem("vaaky ","sentence"));
//
//       addItem(new CityDataItem("mahaan ","great"));
//
//       addItem(new CityDataItem("soch ","think"));
//
//       addItem(new CityDataItem("Well ","say"));
//
//       addItem(new CityDataItem("madad ","help"));
//
//       addItem(new CityDataItem("kam ","low"));
//
//       addItem(new CityDataItem("lain ","line"));
//
//       addItem(new CityDataItem("alag ","differ"));
//
//       addItem(new CityDataItem("mod ","turn"));
//
//       addItem(new CityDataItem("vajah ","cause"));
//
//       addItem(new CityDataItem("bahut ","much"));
//
//       addItem(new CityDataItem("meen ","mean"));
//
//       addItem(new CityDataItem("isase pahale ","before"));
//
//       addItem(new CityDataItem("chaal ","move"));
//
//       addItem(new CityDataItem("sahee ","right"));
//
//       addItem(new CityDataItem("ladaka ","boy"));
//
//       addItem(new CityDataItem("puraana ","old"));
//
//       addItem(new CityDataItem("bahut ","too"));
//
//       addItem(new CityDataItem("vahee ","same"));
//
//       addItem(new CityDataItem("vah ","she"));
//
//       addItem(new CityDataItem("sab ","all"));
//
//       addItem(new CityDataItem("vahaan ","there"));
//
//       addItem(new CityDataItem("kab ","when"));
//
//       addItem(new CityDataItem("uper ","up"));
//
//       addItem(new CityDataItem("upayog ","use"));
//
//       addItem(new CityDataItem("tumhaaree ","your"));
//
//       addItem(new CityDataItem("maarg ","way"));
//
//       addItem(new CityDataItem("ke baare mein ","about"));
//
//       addItem(new CityDataItem("anek ","many"));
//
//       addItem(new CityDataItem("unhen ","them"));
//
//       addItem(new CityDataItem("likho ","write"));
//
//       addItem(new CityDataItem("chaahenge ","would"));
//
//       addItem(new CityDataItem("pasand ","like"));
//
//       addItem(new CityDataItem("isalie ","so"));
//
//       addItem(new CityDataItem("in ","these"));
//
//       addItem(new CityDataItem("usake ","her"));
//
//       addItem(new CityDataItem("lamba ","long"));
//
//       addItem(new CityDataItem("banaana ","make"));
//
//       addItem(new CityDataItem("cheez ","thing"));
//
//       addItem(new CityDataItem("dekh ","see"));
//
//       addItem(new CityDataItem("use ","him"));
//
//       addItem(new CityDataItem("do ","two"));
//
//       addItem(new CityDataItem("hai ","has"));
//
//       addItem(new CityDataItem("nazar ","look"));
//
//       addItem(new CityDataItem("adhik ","more"));
//
//       addItem(new CityDataItem("din ","day"));
//
//       addItem(new CityDataItem("sakata hai ","could"));
//
//       addItem(new CityDataItem("jao ","go"));
//
//       addItem(new CityDataItem("aaie ","come"));
//
//       addItem(new CityDataItem("sankhya ","number"));
//
//       addItem(new CityDataItem("dhvani ","sound"));
//
//       addItem(new CityDataItem("nahin ","no"));
//
//       addItem(new CityDataItem("adhikaansh ","most"));
//
//       addItem(new CityDataItem("my ","people"));
//
//       addItem(new CityDataItem("Well ","my"));
//
//       addItem(new CityDataItem("oopar ","over"));
//
//       addItem(new CityDataItem("know ","know"));
//
//       addItem(new CityDataItem("paanee ","water"));
//
//       addItem(new CityDataItem("se ","than"));
//
//       addItem(new CityDataItem("call ","call"));
//
//       addItem(new CityDataItem("kaun hai? ","who"));
//
//       addItem(new CityDataItem("may ","may"));
//
//       addItem(new CityDataItem("Well ","Well"));
//
//       addItem(new CityDataItem("neeche ","down"));
//
//       addItem(new CityDataItem("paksh ","side"));
//
//       addItem(new CityDataItem("gaya ","been"));
//
//       addItem(new CityDataItem("abhee ","now"));
//
//       addItem(new CityDataItem("khoj ","find"));
//
//       addItem(new CityDataItem("Well ","head"));
//
//       addItem(new CityDataItem("sar ","head"));
//
//       addItem(new CityDataItem("khada ","stand"));
//
//       addItem(new CityDataItem("apana ","own"));
//
//       addItem(new CityDataItem("prshth ","page"));
//
//       addItem(new CityDataItem("chaahie ","should"));
//
//       addItem(new CityDataItem("desh ","country"));
//
//       addItem(new CityDataItem("uttar ","answer"));
//
//       addItem(new CityDataItem("skool ","school"));
//
//       addItem(new CityDataItem("badhana ","grow"));
//
//       addItem(new CityDataItem("adhyayan ","study"));
//
//       addItem(new CityDataItem("phir bhee ","still"));
//
//       addItem(new CityDataItem("seekhana ","learn"));
//
//       addItem(new CityDataItem("paudha ","plant"));
//
//       addItem(new CityDataItem("aavaran ","cover"));
//
//       addItem(new CityDataItem("Well ","khaana"));
//
//       addItem(new CityDataItem("khaana ","food"));
//
//       addItem(new CityDataItem("ravi ","sun"));
//
//       addItem(new CityDataItem("Well ","Well"));
//
//       addItem(new CityDataItem("ke beech ","between"));
//
//       addItem(new CityDataItem("raajy ","state"));
//
//       addItem(new CityDataItem("rakhana ","keep"));
//
//       addItem(new CityDataItem("aankh ","eye"));
//
//       addItem(new CityDataItem("kabhee naheen ","never"));
//
//       addItem(new CityDataItem("pichhale ","last"));
//
//       addItem(new CityDataItem("let ","let"));
//
//       addItem(new CityDataItem("Well ","thought"));
//
//       addItem(new CityDataItem("shahar ","city"));
//
//       addItem(new CityDataItem("ped ","tree"));
//
//       addItem(new CityDataItem("paar karana ","cross"));
//
//       addItem(new CityDataItem("khet ","farm"));
//
//       addItem(new CityDataItem("kathin ","hard"));
//
//       addItem(new CityDataItem("shuroo ","start"));
//
//       addItem(new CityDataItem("paraakram ","might"));
//
//       addItem(new CityDataItem("kahaanee ","story"));
//
//       addItem(new CityDataItem("dekha ","saw"));
//
//       addItem(new CityDataItem("dvaar ","door"));
//
//       addItem(new CityDataItem("samudr ","sea"));
//
//       addItem(new CityDataItem("kheenchana ","draw"));
//
//       addItem(new CityDataItem("baen ","left"));
//
//       addItem(new CityDataItem("der se ","late"));
//
//       addItem(new CityDataItem("daud ","run"));
//
//       addItem(new CityDataItem("mat karo ","don’t"));
//
//       addItem(new CityDataItem("jabaki ","while"));
//
//       addItem(new CityDataItem("dabaen ","press"));
//
//       addItem(new CityDataItem("band kare ","close"));
//
//       addItem(new CityDataItem("raat ","night"));
//
//       addItem(new CityDataItem("asalee ","real"));
//
//       addItem(new CityDataItem("jindagee ","life"));
//
//       addItem(new CityDataItem("kuchh ","few"));
//
//       addItem(new CityDataItem("uttar ","north"));
//
//       addItem(new CityDataItem("pustak ","book"));
//
//       addItem(new CityDataItem("carry ","carry"));
//
//       addItem(new CityDataItem("liya ","took"));
//
//       addItem(new CityDataItem("vigyaan ","science"));
//
//       addItem(new CityDataItem("kha ","eat"));
//
//       addItem(new CityDataItem("kaksh ","room"));
//
//       addItem(new CityDataItem("mitr ","friend"));
//
//       addItem(new CityDataItem("shuroo hua ","began"));
//
//       addItem(new CityDataItem("vichaar ","idea"));
//
//       addItem(new CityDataItem("machhalee ","fish"));
//
//       addItem(new CityDataItem("parvat ","mountain"));
//
//       addItem(new CityDataItem("ruken ","stop"));
//
//       addItem(new CityDataItem("ek baar ","once"));
//
//       addItem(new CityDataItem("aadhaar ","base"));
//
//       addItem(new CityDataItem("suno ","hear"));
//
//       addItem(new CityDataItem("ghoda ","horse"));
//
//       addItem(new CityDataItem("kat gaya ","cut"));
//
//       addItem(new CityDataItem("zaroor ","sure"));
//
//       addItem(new CityDataItem("ghadee ","watch"));
//
//       addItem(new CityDataItem("rang ","color"));
//
//       addItem(new CityDataItem("chehara ","face"));
//
//       addItem(new CityDataItem("lakadee ","wood"));
//
//       addItem(new CityDataItem("mukhy ","main"));
//
//       addItem(new CityDataItem("khula hua ","open"));
//
//       addItem(new CityDataItem("lagata hai ","seem"));
//
//       addItem(new CityDataItem("saath mein ","together"));
//
//       addItem(new CityDataItem("aage ","next"));
//
//       addItem(new CityDataItem("saphed ","white"));
//
//       addItem(new CityDataItem("bachche ","children"));
//
//       addItem(new CityDataItem("shuroo ","begin"));
//
//       addItem(new CityDataItem("mila ","got"));
//
//       addItem(new CityDataItem("tahal lo","walk"));
//
//       addItem(new CityDataItem("udaaharan ","example"));
//
//       addItem(new CityDataItem("aasaam ","easy"));
//
//       addItem(new CityDataItem("kaagaz ","paper"));
//
//       addItem(new CityDataItem("samooh ","group"));
//
//       addItem(new CityDataItem("hamesha ","always"));
//
//       addItem(new CityDataItem("sangeet ","music"));
//
//       addItem(new CityDataItem("un ","those"));
//
//       addItem(new CityDataItem("donon ","both"));
//
//       addItem(new CityDataItem("nishaan ","mark"));
//
//       addItem(new CityDataItem("aksar ","often"));
//
//       addItem(new CityDataItem("patr ","letter"));
//
//       addItem(new CityDataItem("jab tak ","until"));
//
//       addItem(new CityDataItem("meel ","mile"));
//
//       addItem(new CityDataItem("nadee ","river"));
//
//       addItem(new CityDataItem("pair ka panja ","feet"));
//
//       addItem(new CityDataItem("devakhaal ","care"));
//
//       addItem(new CityDataItem("doosara ","second"));
//
//       addItem(new CityDataItem("bas ","enough"));
//
//       addItem(new CityDataItem("maidaan ","plain"));
//
//       addItem(new CityDataItem("ladakee ","girl"));
//
//       addItem(new CityDataItem("saamaany ","usual"));
//
//       addItem(new CityDataItem("yuva ","young"));
//
//       addItem(new CityDataItem("taiyaar ","ready"));
//
//       addItem(new CityDataItem("oopar ","above"));
//
//       addItem(new CityDataItem("kabhee ","ever"));
//
//       addItem(new CityDataItem("laal ","red"));
//
//       addItem(new CityDataItem("soochee ","list"));
//
//       addItem(new CityDataItem("haalaanki ","though"));
//
//       addItem(new CityDataItem("maanana ","feel"));
//
//       addItem(new CityDataItem("baatacheet ","talk"));
//
//       addItem(new CityDataItem("bird ","bird"));
//
//       addItem(new CityDataItem("jald hee ","soon"));
//
//       addItem(new CityDataItem("tan ","body"));
//
//       addItem(new CityDataItem("kutta ","dog"));
//
//       addItem(new CityDataItem("parivaar ","family"));
//
//       addItem(new CityDataItem("pratyaksh ","direct"));
//
//       addItem(new CityDataItem("poj ","pose"));
//
//       addItem(new CityDataItem("chhodana ","leave"));
//
//       addItem(new CityDataItem("geet ","song"));
//
//       addItem(new CityDataItem("upaay ","measure"));
//
//       addItem(new CityDataItem("dvaar ","door"));
//
//       addItem(new CityDataItem("utpaad ","product"));
//
//       addItem(new CityDataItem("kaalee ","black"));
//
//       addItem(new CityDataItem("kam ","short"));
//
//       addItem(new CityDataItem("ank ","numeral"));
//
//       addItem(new CityDataItem("kaksha ","class"));
//
//       addItem(new CityDataItem("hava ","wind"));
//
//       addItem(new CityDataItem("savaal ","question"));
//
//       addItem(new CityDataItem("hona ","happen"));
//
//       addItem(new CityDataItem("Well ","complete"));
//
//       addItem(new CityDataItem("ship ","poorn"));
//
//       addItem(new CityDataItem("samundree jahaaj ","ship"));
//
//       addItem(new CityDataItem("kshetr ","area"));
//
//       addItem(new CityDataItem("aadha ","half"));
//
//       addItem(new CityDataItem("chattaan ","rock"));
//
//       addItem(new CityDataItem("gan ","order"));
//
//       addItem(new CityDataItem("aag ","fire"));
//
//       addItem(new CityDataItem("dakshin ","south"));
//
//       addItem(new CityDataItem("museebat ","problem"));
//
//       addItem(new CityDataItem("tukada ","piece"));
//
//       addItem(new CityDataItem("bola tha ","told"));
//
//       addItem(new CityDataItem("jaanata tha ","knew"));
//
//       addItem(new CityDataItem("utteern karana ","pass"));
//
//       addItem(new CityDataItem("jabase ","since"));
//
//       addItem(new CityDataItem("oopar ","top"));
//
//       addItem(new CityDataItem("poora ka poora ","whole"));
//
//       addItem(new CityDataItem("raaja ","king"));
//
//       addItem(new CityDataItem("sadak ","street"));
//
//       addItem(new CityDataItem("inch ","inch"));
//
//       addItem(new CityDataItem("guna ","multiply"));
//
//       addItem(new CityDataItem("kuchh bhee to nahin ","nothing"));
//
//       addItem(new CityDataItem("kors ","course"));
//
//       addItem(new CityDataItem("rahana ","stay"));
//
//       addItem(new CityDataItem("pahiya ","wheel"));
//
//       addItem(new CityDataItem("poorn ","full"));
//
//       addItem(new CityDataItem("bal ","force"));
//
//       addItem(new CityDataItem("neela ","blue"));
//
//       addItem(new CityDataItem("vastu ","object"));
//
//       addItem(new CityDataItem("tay ","decide"));
//
//       addItem(new CityDataItem("satah ","surface"));
//
//       addItem(new CityDataItem("gahara ","deep"));
//
//       addItem(new CityDataItem("chaand ","moon"));
//
//       addItem(new CityDataItem("dveep ","island"));
//
//       addItem(new CityDataItem("pair ","foot"));
//
//       addItem(new CityDataItem("pranaalee ","system"));
//
//       addItem(new CityDataItem("vyast ","busy"));
//
//       addItem(new CityDataItem("pareeksha ","test"));
//
//       addItem(new CityDataItem("abhilekh ","record"));
//
//       addItem(new CityDataItem("naav ","boat"));
//
//       addItem(new CityDataItem("saamaany ","common"));
//
//       addItem(new CityDataItem("sona ","gold"));
//
//       addItem(new CityDataItem("mumakin ","possible"));
//
//       addItem(new CityDataItem("vimaan ","plane"));
//
//       addItem(new CityDataItem("jagah ","stead"));
//
//       addItem(new CityDataItem("sookhee ","dry"));
//
//       addItem(new CityDataItem("aashchary ","wonder"));
//
//       addItem(new CityDataItem("hasana ","laugh"));
//
//       addItem(new CityDataItem("hazaar ","thousand"));
//
//       addItem(new CityDataItem("poorv ","ago"));
//
//       addItem(new CityDataItem("dauda ","ran"));
//
//       addItem(new CityDataItem("jaanch ","check"));
//
//       addItem(new CityDataItem("khel ","game"));
//
//       addItem(new CityDataItem("aakaar ","shape"));
//
//       addItem(new CityDataItem("samaanata ","equate"));
//
//       addItem(new CityDataItem("garam ","hot"));
//
//       addItem(new CityDataItem("kumaaree ","miss"));
//
//       addItem(new CityDataItem("laaya ","brought"));
//
//       addItem(new CityDataItem("tapish ","heat"));
//
//       addItem(new CityDataItem("himapaat ","snow"));
//
//       addItem(new CityDataItem("taayar ","tire"));
//
//       addItem(new CityDataItem("laana ","bring"));
//
//       addItem(new CityDataItem("haan ","yes"));
//
//       addItem(new CityDataItem("door ","distant"));
//
//       addItem(new CityDataItem("bharan ","fill"));
//
//       addItem(new CityDataItem("poorv ","east"));
//
//       addItem(new CityDataItem("rang ","pānt"));
//
//       addItem(new CityDataItem("bhaasha ","language"));
//
//       addItem(new CityDataItem("ke beech mein ","among"));
//
//       addItem(new CityDataItem("ikaee ","unit"));
//
//       addItem(new CityDataItem("shakti ","power"));
//
//       addItem(new CityDataItem("nagar ","town"));
//
//       addItem(new CityDataItem("theek ","fine"));
//
//       addItem(new CityDataItem("kuchh ","certain"));
//
//       addItem(new CityDataItem("udana ","fly"));
//
//       addItem(new CityDataItem("girana ","fall"));
//
//       addItem(new CityDataItem("netrtv ","lead"));
//
//       addItem(new CityDataItem("rona ","cry"));
//
//       addItem(new CityDataItem("andhera ","dark"));
//
//       addItem(new CityDataItem("masheen ","machine"));
//
//       addItem(new CityDataItem("dhyaan den ","note"));
//
//       addItem(new CityDataItem("ruko ","wait"));
//
//       addItem(new CityDataItem("yojana ","plan"));
//
//       addItem(new CityDataItem("aakrti ","figure"));
//
//       addItem(new CityDataItem("sitaara ","star"));
//
//       addItem(new CityDataItem("dibba ","box"));
//
//       addItem(new CityDataItem("sangya ","noun"));
//
//       addItem(new CityDataItem("maidaan ","field"));
//
//       addItem(new CityDataItem("rest ","rest"));
//
//       addItem(new CityDataItem("sahee baat ","correct"));
//
//       addItem(new CityDataItem("yogy ","able"));
//
//       addItem(new CityDataItem("paund ","pound"));
//
//       addItem(new CityDataItem("kiya hua ","done"));
//
//       addItem(new CityDataItem("sundarata ","beauty"));
//
//       addItem(new CityDataItem("chalaana ","drive"));
//
//       addItem(new CityDataItem("khada tha ","stood"));
//
//       addItem(new CityDataItem("shaamil ","contain"));
//
//       addItem(new CityDataItem("saamane ","front"));
//
//       addItem(new CityDataItem("sikhaane ","teach"));
//
//       addItem(new CityDataItem("saptaah ","week"));
//
//       addItem(new CityDataItem("antim ","final"));
//
//       addItem(new CityDataItem("diya ","gave"));
//
//       addItem(new CityDataItem("hara ","green"));
//
//       addItem(new CityDataItem("oh ","oh"));
//
//       addItem(new CityDataItem("sheeghr ","quick"));
//
//       addItem(new CityDataItem("vikasit karana ","develop"));
//
//       addItem(new CityDataItem("saagar ","ocean"));
//
//       addItem(new CityDataItem("garam ","warm"));
//
//       addItem(new CityDataItem("ni: shulk ","free"));
//
//       addItem(new CityDataItem("minat ","minute"));
//
//       addItem(new CityDataItem("majaboot ","strong"));
//
//       addItem(new CityDataItem("vishesh ","special"));
//
//       addItem(new CityDataItem("man ","mind"));
//
//       addItem(new CityDataItem("peechhe ","behind"));
//
//       addItem(new CityDataItem("spasht ","clear"));
//
//       addItem(new CityDataItem("poonchh ","tail"));
//
//       addItem(new CityDataItem("utpaadit karen ","produce"));
//
//       addItem(new CityDataItem("tathy ","fact"));
//
//       addItem(new CityDataItem("antariksh ","space"));
//
//       addItem(new CityDataItem("hard ","heard"));
//
//       addItem(new CityDataItem("shreshth ","best"));
//
//       addItem(new CityDataItem("is ghante ","hour"));
//
//       addItem(new CityDataItem("behatar ","better"));
//
//       addItem(new CityDataItem("sach ","true"));
//
//       addItem(new CityDataItem("dauraan ","during"));
//
//       addItem(new CityDataItem("sau ","hundred"));
//
//       addItem(new CityDataItem("paanch ","five"));
//
//       addItem(new CityDataItem("yaad hai ","remember"));
//
//       addItem(new CityDataItem("kadam ","step"));
//
//       addItem(new CityDataItem("sheeghr ","early"));
//
//       addItem(new CityDataItem("pashchim ","west"));
//
//       addItem(new CityDataItem("bhoomi ","ground"));
//
//       addItem(new CityDataItem("byaaj ","interest"));
//
//       addItem(new CityDataItem("pahunch ","reach"));
//
//       addItem(new CityDataItem("tej ","fast"));
//
//       addItem(new CityDataItem("kriya ","verb"));
//
//       addItem(new CityDataItem("gao ","sing"));
//
//       addItem(new CityDataItem("baat suno ","listen"));
//
//       addItem(new CityDataItem("chhah ","six"));
//
//       addItem(new CityDataItem("tebal ","table"));
//
//       addItem(new CityDataItem("yaatra ","travel"));
//
//       addItem(new CityDataItem("kam se ","less"));
//
//       addItem(new CityDataItem("subah ","morning"));
//
//       addItem(new CityDataItem("das ","ten"));
//
//       addItem(new CityDataItem("saral ","simple"));
//
//       addItem(new CityDataItem("kaee ","several"));
//
//       addItem(new CityDataItem("svar ","vowel"));
//
//       addItem(new CityDataItem("kee or ","toward"));
//
//       addItem(new CityDataItem("lay ","war"));
//
//       addItem(new CityDataItem("viruddh ","against"));
//
//       addItem(new CityDataItem("pratiroop ","pattern"));
//
//       addItem(new CityDataItem("dheere ","slow"));
//
//       addItem(new CityDataItem("kendr ","center"));
//
//       addItem(new CityDataItem("prem ","love"));
//
//       addItem(new CityDataItem("vyakti ","person"));
//
//       addItem(new CityDataItem("paise ","money"));
//
//       addItem(new CityDataItem("seva kar ","serve"));
//
//       addItem(new CityDataItem("road ","dikhaee"));
//
//       addItem(new CityDataItem("sadak ","road"));
//
//       addItem(new CityDataItem("varsha ","rain"));
//
//       addItem(new CityDataItem("niyam ","rule"));
//
//       addItem(new CityDataItem("shasan ","govern"));
//
//       addItem(new CityDataItem("kheenchen ","pull"));
//
//       addItem(new CityDataItem("sardee ","cold"));
//
//       addItem(new CityDataItem("notis ","notice"));
//
//       addItem(new CityDataItem("aavaaz ","voice"));
//
//       addItem(new CityDataItem("oorja ","energy"));
//
//       addItem(new CityDataItem("shikaar ","hunt"));
//
//       addItem(new CityDataItem("sambhaavit ","probable"));
//
//       addItem(new CityDataItem("bistar ","bed"));
//
//       addItem(new CityDataItem("bhaee ","brother"));
//
//       addItem(new CityDataItem("anda ","egg"));
//
//       addItem(new CityDataItem("savaaree ","ride"));
//
//       addItem(new CityDataItem("sel ","cell"));
//
//       addItem(new CityDataItem("maanana ","believe"));
//
//       addItem(new CityDataItem("shaayad ","perhaps"));
//
//       addItem(new CityDataItem("chunana ","pick"));
//
//       addItem(new CityDataItem("achaanak ","sudden"));
//
//       addItem(new CityDataItem("ginatee ","count"));
//
//       addItem(new CityDataItem("skvaayar ","square"));
//
//       addItem(new CityDataItem("kaaran ","reason"));
//
//       addItem(new CityDataItem("lambaee ","length"));
//
//       addItem(new CityDataItem("ka pratinidhitv ","represent"));
//
//       addItem(new CityDataItem("kala ","art"));
//
//       addItem(new CityDataItem("vishay ","subject"));
//
//       addItem(new CityDataItem("kshetr ","region"));
//
//       addItem(new CityDataItem("aakaar ","size"));
//
//       addItem(new CityDataItem("bhinn ","vary"));
//
//       addItem(new CityDataItem("rukana ","settle"));
//
//       addItem(new CityDataItem("bole ","speak"));
//
//       addItem(new CityDataItem("vajan ","weight"));
//
//       addItem(new CityDataItem("aam ","general"));
//
//       addItem(new CityDataItem("barph ","ice"));
//
//       addItem(new CityDataItem("maamala ","matter"));
//
//       addItem(new CityDataItem("vrtt ","circle"));
//
//       addItem(new CityDataItem("joda ","pair"));
//
//       addItem(new CityDataItem("shaamil ","include"));
//
//       addItem(new CityDataItem("vibhaajan ","divide"));
//
//       addItem(new CityDataItem("shabdaansh ","syllable"));
//
//       addItem(new CityDataItem("mahasoos kiya ","felt"));
//
//       addItem(new CityDataItem("bada ","grand"));
//
//       addItem(new CityDataItem("gend ","ball"));
//
//       addItem(new CityDataItem("abhee tak ","yet"));
//
//       addItem(new CityDataItem("lahar ","wave"));
//
//       addItem(new CityDataItem("drop ","drop"));
//
//       addItem(new CityDataItem("dil ","heart"));
//
//       addItem(new CityDataItem("baje ","am"));
//
//       addItem(new CityDataItem("vartamaan ","present"));
//
//       addItem(new CityDataItem("haivee ","heavy"));
//
//       addItem(new CityDataItem("nrty ","dance"));
//
//       addItem(new CityDataItem("yantr ","engine"));
//
//       addItem(new CityDataItem("pad ","position"));
//
//       addItem(new CityDataItem("haath ","arm"));
//
//       addItem(new CityDataItem("chauda ","wide"));
//
//       addItem(new CityDataItem("jalayaatra ","sail"));
//
//       addItem(new CityDataItem("saamagree ","material"));
//
//       addItem(new CityDataItem("ansh ","fraction"));
//
//       addItem(new CityDataItem("van ","forest"));
//
//       addItem(new CityDataItem("baithiye ","sit"));
//
//       addItem(new CityDataItem("res ","race"));
//
//       addItem(new CityDataItem("khidakee ","window"));
//
//       addItem(new CityDataItem("dukaan ","store"));
//
//       addItem(new CityDataItem("garmee ","summer"));
//
//       addItem(new CityDataItem("rel gaadee ","train"));
//
//       addItem(new CityDataItem("neend ","sleep"));
//
//       addItem(new CityDataItem("saabit karana ","prove"));
//
//       addItem(new CityDataItem("akela ","lone"));
//
//       addItem(new CityDataItem("taang ","leg"));
//
//       addItem(new CityDataItem("vyaayaam ","exercise"));
//
//       addItem(new CityDataItem("deevaar ","wall"));
//
//       addItem(new CityDataItem("pakada ","catch"));
//
//       addItem(new CityDataItem("parvat ","mount"));
//
//       addItem(new CityDataItem("tamanna ","wish"));
//
//       addItem(new CityDataItem("aakaash ","sky"));
//
//       addItem(new CityDataItem("board ","aakaash"));
//
//       addItem(new CityDataItem("sardee ","winter"));
//
//       addItem(new CityDataItem("harsh ","joy"));
//
//       addItem(new CityDataItem("baith gaya ","sat"));
//
//       addItem(new CityDataItem("likha hua ","written"));
//
//       addItem(new CityDataItem("jangalee","wild"));
//
//       addItem(new CityDataItem("yantr ","instrument"));
//
//       addItem(new CityDataItem("rakha ","kept"));
//
//       addItem(new CityDataItem("kaanch ","glass"));
//
//       addItem(new CityDataItem("ghaas ","grass"));
//
//       addItem(new CityDataItem("gaay ","cow"));
//
//       addItem(new CityDataItem("kaam ","job"));
//
//       addItem(new CityDataItem("ej ","edge"));
//
//       addItem(new CityDataItem("sanket ","sign"));
//
//       addItem(new CityDataItem("yaatra ","visit"));
//
//       addItem(new CityDataItem("ateet ","past"));
//
//       addItem(new CityDataItem("mulaayam ","soft"));
//
//       addItem(new CityDataItem("aanand ","fun"));
//
//       addItem(new CityDataItem("ujjval ","bright"));
//
//       addItem(new CityDataItem("gais ","gas"));
//
//       addItem(new CityDataItem("mausam ","weather"));
//
//       addItem(new CityDataItem("maheena ","month"));
//
//       addItem(new CityDataItem("das laakh ","million"));
//
//       addItem(new CityDataItem("bhaaloo ","bear"));
//
//       addItem(new CityDataItem("samaapt ","finish"));
//
//       addItem(new CityDataItem("khush ","happy"));
//
//       addItem(new CityDataItem("aasha ","hope"));
//
//       addItem(new CityDataItem("phool ","phool"));
//
//       addItem(new CityDataItem("kapade ","clothe"));
//
//       addItem(new CityDataItem("ajeeb ","strange"));
//
//       addItem(new CityDataItem("gaya hua ","gone"));
//
//       addItem(new CityDataItem("vyaapaar ","trade"));
//
//       addItem(new CityDataItem("raag ","melody"));
//
//       addItem(new CityDataItem("yaatra ","trip"));
//
//       addItem(new CityDataItem("kaaryaalay ","office"));
//
//       addItem(new CityDataItem("praapt karana ","receive"));
//
//       addItem(new CityDataItem("pankti ","row"));
//
//       addItem(new CityDataItem("munh ","mouth"));
//
//       addItem(new CityDataItem("sateek ","exact"));
//
//       addItem(new CityDataItem("prateek ","symbol"));
//
//       addItem(new CityDataItem("marana ","die"));
//
//       addItem(new CityDataItem("kam se kam ","least"));
//
//       addItem(new CityDataItem("museebat ","trouble"));
//
//       addItem(new CityDataItem("chillao ","shout"));
//
//       addItem(new CityDataItem("ke sivaay ","except"));
//
//       addItem(new CityDataItem("likha tha ","wrote"));
//
//       addItem(new CityDataItem("beej ","seed"));
//
//       addItem(new CityDataItem("sur ","tone"));
//
//       addItem(new CityDataItem("mein shaamil hone ke ","join"));
//
//       addItem(new CityDataItem("sujhaana ","suggest"));
//
//       addItem(new CityDataItem("svachchh ","clean"));
//
//       addItem(new CityDataItem("tootana ","break"));
//
//       addItem(new CityDataItem("mahila ","lady"));
//
//       addItem(new CityDataItem("yaard ","yard"));
//
//       addItem(new CityDataItem("vrddhi ","rise"));
//
//       addItem(new CityDataItem("kharaab ","bad"));
//
//       addItem(new CityDataItem("phunk maara ","blow"));
//
//       addItem(new CityDataItem("tel ","oil"));
//
//       addItem(new CityDataItem("rakt ","blood"));
//
//       addItem(new CityDataItem("sparsh ","touch"));
//
//       addItem(new CityDataItem("badhee ","grew"));
//
//       addItem(new CityDataItem("pratishat ","cent"));
//
//       addItem(new CityDataItem("miks ","mix"));
//
//       addItem(new CityDataItem("teem ","team"));
//
//       addItem(new CityDataItem("vaayar ","wire"));
//
//       addItem(new CityDataItem("laagat ","cost"));
//
//       addItem(new CityDataItem("kho gaya","lost"));
//
//       addItem(new CityDataItem("bhoora ","brown"));
//
//       addItem(new CityDataItem("pahan lena ","wear"));
//
//       addItem(new CityDataItem("bageecha ","garden"));
//
//       addItem(new CityDataItem("baraabaree ka ","equal"));
//
//       addItem(new CityDataItem("bhej diya ","sent"));
//
//       addItem(new CityDataItem("chunen ","choose"));
//
//       addItem(new CityDataItem("gir gaya ","fell"));
//
//       addItem(new CityDataItem("phit ","fit"));
//
//       addItem(new CityDataItem("bahe ","flow"));
//
//       addItem(new CityDataItem("nishpaksh ","fair"));
//
//       addItem(new CityDataItem("baink ","bank"));
//
//       addItem(new CityDataItem("kalekt ","collect"));
//
//       addItem(new CityDataItem("sahejen ","save"));
//
//       addItem(new CityDataItem("niyantran ","control"));
//
//       addItem(new CityDataItem("dashamalav ","decimal"));
//
//       addItem(new CityDataItem("kaan ","ear"));
//
//       addItem(new CityDataItem("any ","else"));
//
//       addItem(new CityDataItem("tod diya ","quite"));
//
//       addItem(new CityDataItem("maamala ","case"));
//
//       addItem(new CityDataItem("madhy ","middle"));
//
//       addItem(new CityDataItem("maar ","kill"));
//
//       addItem(new CityDataItem("beta ","son"));
//
//       addItem(new CityDataItem("jheel ","lake"));
//
//       addItem(new CityDataItem("pal ","moment"));
//
//       addItem(new CityDataItem("skel ","scale"));
//
//       addItem(new CityDataItem("jor ","loud"));
//
//       addItem(new CityDataItem("vasant ","spring"));
//
//       addItem(new CityDataItem("nireekshan ","observe"));
//
//       addItem(new CityDataItem("bachcha ","child"));
//
//       addItem(new CityDataItem("seedhe ","straight"));
//
//       addItem(new CityDataItem("hindi ","consonant"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//       addItem(new CityDataItem("hindi ","english"));
//
//
//
//
//
//
//
//
//       addItem(new CityDataItem("thanda hai.","It's cold. "));
//
//       addItem(new CityDataItem("Well done! ","Well done! "));
//
//       addItem(new CityDataItem("bahut badhiya!","Well done! "));
//
//       addItem(new CityDataItem("kaun jaane?","Who knows? "));
//
//       addItem(new CityDataItem("aashcharyajanak!","Wonderful!"));
//
//       addItem(new CityDataItem("Wonderful","Wonderful"));
//
//       addItem(new CityDataItem("chidiyon ka gaan.","Birds sing. "));
//
//       addItem(new CityDataItem("andar aa jao.","Come on in. "));
//
//       addItem(new CityDataItem("nishchit hee","Definitely! "));
//
//       addItem(new CityDataItem("hilana mat.","Don't move. "));
//
//       addItem(new CityDataItem("aag se jalane kee chot.","Fire burns. "));
//
//       addItem(new CityDataItem("usaka peechha karate hain.","Follow him. "));
//
//       addItem(new CityDataItem("mujhe tairana aata hai.","I can swim. "));
//
//       addItem(new CityDataItem("I love you.","I love you."));
//
//       addItem(new CityDataItem("mai koshish karoonga.","I will try. ("));
//
//       addItem(new CityDataItem("main aa raha hoon.","I'm coming."));
//
//       addItem(new CityDataItem("main bhugat rahaan hoon!", "I am suffering!"));
//
//       addItem(new CityDataItem("mujhe bhookh lagee hai!","I'm hungry! "));
//
//       addItem(new CityDataItem("use andar aane do.","Let him in."));
//
//       addItem(new CityDataItem("mujhe baahar nikaalo!","Let me out! "));
//
//       addItem(new CityDataItem("aur ek baar.","Once again. "));
//
//       addItem(new CityDataItem("krpaya baith jao.","Please sit."));
//
//       addItem(new CityDataItem("ki ek ladaka!","That a boy!"));
//
//       addItem(new CityDataItem("naya kya hai?","What's new? "));
//
//       addItem(new CityDataItem("vo kaun hai?","Who's that? "));
//
//       addItem(new CityDataItem("chillao mat.","Don't shout."));
//
//       addItem(new CityDataItem("Wow! ","Wow! "));
//
//       addItem(new CityDataItem("vaah!","Wow! "));
//
//       addItem(new CityDataItem("Help!","Help!"));
//
//       addItem(new CityDataItem("madad!","Help!"));
//
//       addItem(new CityDataItem("Hello! ","Hello! "));
//
//       addItem(new CityDataItem("namaskaar!","Hello!"));
//
//       addItem(new CityDataItem("Wow wow!!","Cheers! "));
//
//       addItem(new CityDataItem("Cheers!","Cheers!"));
//
//       addItem(new CityDataItem("samajh gaya? ","Got it? "));
//
//       addItem(new CityDataItem("mein theek hoon.","I'm OK. "));
//
//       addItem(new CityDataItem("ham jeet gae.","We won."));
//
//       addItem(new CityDataItem("bahut badhiya!","Awesome! "));
//
//       addItem(new CityDataItem("andar aaie.","Come in. "));
//
//       addItem(new CityDataItem("baahar jao!","Get out! "));
//
//       addItem(new CityDataItem("chale jao!","Go away! "));
//
//       addItem(new CityDataItem("alavida!","Goodbye! "));
//
//       addItem(new CityDataItem("uttam!","Perfect! "));
//
//       addItem(new CityDataItem("ham haar gae.","We lost."));
//
//       addItem(new CityDataItem("svaagat he.","Welcome. "));
//
//       addItem(new CityDataItem("maze karo.","Have fun. "));
//
//       addItem(new CityDataItem("main bhool gaya.","I forgot."));
//
//       addItem(new CityDataItem("main paisa doonga.","I'll pay."));
//
//       addItem(new CityDataItem("mai theek hoon.","I'm fine. "));
//
//       addItem(new CityDataItem("mera pet bhar chuka hai.","I'm full."));
//
//       addItem(new CityDataItem("halo chalate hain!","Let's go!"));
//
//       addItem(new CityDataItem("mujhe uttar do.","Answer me."));
//
//       addItem(new CityDataItem("hidiya udatee hai.","Birds fly."));
//
//       addItem(new CityDataItem("maaf karenge.","Excuse me. "));
//
//       addItem(new CityDataItem("bahut khubas!","Fantastic! "));
//
//       addItem(new CityDataItem("mujhe behoshee chha gaee.","I fainted. "));
//
//       addItem(new CityDataItem("mujhe to dar lagata hai.","I fear so."));
//
//       addItem(new CityDataItem("main hansa.","I laughed."));
//
//       addItem(new CityDataItem("main akela hoon.","I'm alone. "));
//
//       addItem(new CityDataItem("vah uth khada hooa.","He stood up. "));
//
//       addItem(new CityDataItem("vah majaboot hai.","He's strong. "));
//
//       addItem(new CityDataItem("mujhe kek pasand hai.","I like cake. "));
//
//       addItem(new CityDataItem("mujhai kuttai pasand hai।","mujhe kutte pasand hai."));
//
//       addItem(new CityDataItem("mujhe ganit pasand hai.","I like math."));
//
//       addItem(new CityDataItem("main bhaag loonga.","I'll attend. "));
//
//       addItem(new CityDataItem("koee nahin aaya.","Nobody came. "));
//
//       addItem(new CityDataItem("kisee ne jhooth nahin bola.","Nobody lied."));
//
//       addItem(new CityDataItem("kya main galat tha?","Was I wrong? "));
//
//       addItem(new CityDataItem("hamane vaada kiya.","We promised."));
//
//       addItem(new CityDataItem("yah kya hai?","What's this?"));
//
//       addItem(new CityDataItem("kya tum beemaar ho?","Are you sick?"));
//
//       addItem(new CityDataItem("hindi","Bring him in."));
//
//       addItem(new CityDataItem("hamaare saath aao.","Come with us. "));
//
//       addItem(new CityDataItem("Happy Easter!","Happy Easter! "));
//
//       addItem(new CityDataItem("tom chhod diya hai?","Has Tom left? "));
//
//       addItem(new CityDataItem("mein ghar par hoon.","I am at home."));
//
//       addItem(new CityDataItem("main hil nahin sakata.","I can't move. "));
//
//       addItem(new CityDataItem("mujhe nahin pata.","I don't know. "));
//
//       addItem(new CityDataItem("mere paas ek car hai.","I have a car. "));
//
//       addItem(new CityDataItem("mere paas ek kutta hai.","I have a dog."));
//
//       addItem(new CityDataItem("mai samajhata hun.","I understand."));
//
//       addItem(new CityDataItem("main ek chikitsak hoon.","I'm a doctor."));
//
//       addItem(new CityDataItem("yah ek pustak hai.","It is a book."));
//
//       addItem(new CityDataItem("aaj barf gir rahee hai.","It's snowing."));
//
//       addItem(new CityDataItem("yah kitana bada hai.","It's too big."));
//
//       addItem(new CityDataItem("krpaya jaen.","Please leave. "));
//
//       addItem(new CityDataItem("avishvasaneey!","Unbelievable!"));
//
//       addItem(new CityDataItem("ham khush hain.","We are happy."));
//
//       addItem(new CityDataItem("yah kya hai?","What is this? "));
//
//       addItem(new CityDataItem("kya tum thake hue ho?","Are you tired? "));
//
//       addItem(new CityDataItem("kya aap draiv kar sakate hain?","Can you drive? "));
//
//       addItem(new CityDataItem("kya aapako yah samajh aaya?","Do you get it?"));
//
//       addItem(new CityDataItem("mota mat ho.","Don't get fat. "));
//
//       addItem(new CityDataItem("andar mat dena.","Don't give in. "));
//
//       addItem(new CityDataItem("ise pee jaen","Drink it down."));
//
//       addItem(new CityDataItem("har koee marata hai.","Everyone dies."));
//
//       addItem(new CityDataItem("phool khilate hain.","Flowers bloom. "));
//
//       addItem(new CityDataItem("main hoon jo bhee main hoon.","I am who I am."));
//
//       addItem(new CityDataItem("main cheejon ko jaanata hoon.","I know things."));
//
//       addItem(new CityDataItem("main use le jaoonga.","I'll take him."));
//
//       addItem(new CityDataItem("ab main thak gaya hoon.","I'm tired now."));
//
//       addItem(new CityDataItem("main bahut vyast hoon.","I'm very busy."));
//
//       addItem(new CityDataItem("kya vah billee hai?","Is that a cat?"));
//
//       addItem(new CityDataItem("yah mupht mein hai.","It's for free. "));
//
//       addItem(new CityDataItem("mujhe ise aajamaane do","Let me try it."));
//
//       addItem(new CityDataItem("chalo karate hain.","Let's do that."));
//
//       addItem(new CityDataItem("ise jaldee banao.","Make it quick. "));
//
//       addItem(new CityDataItem("kya main andar aa sakata hoon?","May I come in?"));
//
//       addItem(new CityDataItem("ise phir se padho.","Read it again."));
//
//       addItem(new CityDataItem("ise zor se padhen.","Read it aloud."));
//
//       addItem(new CityDataItem("vah neeche jhuka.","She bent down. ("));
//
//       addItem(new CityDataItem("yah ek naksha hai.","This is a map. "));
//
//       addItem(new CityDataItem("yaah ik naksh hai.","yah ek naksha hai."));
//
//       addItem(new CityDataItem("kya tumane golee maaree thee?","Were you shot? "));
//
//       addItem(new CityDataItem("hamaare baare mein kya hai?","What about us? "));
//
//       addItem(new CityDataItem("kya main aapakee madad kar sakata hoon?","Can I help you?"));
//
//       addItem(new CityDataItem("kamara saaph karen.","Clean the room."));
//
//       addItem(new CityDataItem("ise mat chhuo.","Don't touch it."));
//
//       addItem(new CityDataItem("bed se utaren!","Get out of bed! "));
//
//       addItem(new CityDataItem("navavarsh kee shubhakaamana!","Happy New Year! "));
//
//       addItem(new CityDataItem("janmadin mubaarak!","Happy birthday! "));
//
//       addItem(new CityDataItem("chhuttiyaan aanandadaayak hon.","Happy holidays. "));
//
//       addItem(new CityDataItem("usakee daadhee hai.","He has a beard."));
//
//       addItem(new CityDataItem("vah ek abhineta hai.","He is an actor."));
//
//       addItem(new CityDataItem("use paison kee jaroorat hai.","He needs money."));
//
//       addItem(new CityDataItem("vah kathin tha.","He was hard up. "));
//
//       addItem(new CityDataItem("mujhe itihaas achchha lagata hai.","I like history. "));
//
//       addItem(new CityDataItem("mujhe kutta pasand hai."," I like the dog."));
//
//       addItem(new CityDataItem("mujhe ek khareedana chaahie.","I must buy one."));
//
//       addItem(new CityDataItem("mai vaapas aaoonga.","I'll come back."));
//
//       addItem(new CityDataItem("main aapako fon karoonga.","I'll phone you."));
//
//       addItem(new CityDataItem("main ghar rahoonga.","I'll stay home. "));
//
//       addItem(new CityDataItem("main ek naastik hoon."," I'm an atheist. "));
//
//       addItem(new CityDataItem("main bahut thak gaya hoon.","I'm very tired."));
//
//       addItem(new CityDataItem("aaj garmee hai.","It's hot today."));
//
//       addItem(new CityDataItem("yah kitaab hai.","It's this book."));
//
//       addItem(new CityDataItem("yah aapakee chaal hai.","It's your move."));
//
//       addItem(new CityDataItem("keval bhagavaan jaanata hai.","Only God knows."));
//
//       addItem(new CityDataItem("garmiyaan khatm ho gaeen.","Summer is over."));
//
//       addItem(new CityDataItem("paryaapt samay lo.","Take your time."));
//
//       addItem(new CityDataItem("isake baare mein socho.","Think about it."));
//
//       addItem(new CityDataItem("yah ek pustak hai.","This is a book."));
//
//       addItem(new CityDataItem("yah mera baig hai."," This is my bag. "));
//
//       addItem(new CityDataItem("yah mera kutta hai.","This is my dog."));
//
//       addItem(new CityDataItem("apane pair dho lo.","Wash your feet."));
//
//       addItem(new CityDataItem("apane pair dho lo.","Wash your feet."));
//
//       addItem(new CityDataItem("ham aapako phon karenge.","We'll call you. "));
//
//       addItem(new CityDataItem("tum kahaan the?","Where were you?"));
//
//       addItem(new CityDataItem("tumhen jaana chaahie.","You have to go."));
//
//       addItem(new CityDataItem("tum thake hue lag rahe ho.","You look tired."));
//
//       addItem(new CityDataItem("aap majaak kar rahe ho!","You're kidding! "));
//
//       addItem(new CityDataItem("ek aadamee ko kaam karana chaahie.","A man must work. "));
//
//       addItem(new CityDataItem("kya aap ghar par hain?","Are you at home?"));
//
//       addItem(new CityDataItem("kya tum log theek ho?","Are you guys OK? "));
//
//       addItem(new CityDataItem("jaldee ghar aa jao."," Come home early. "));
//
//       addItem(new CityDataItem("aa sako to aao.","Come if you can."));
//
//       addItem(new CityDataItem("jaldee ghar aa jao.","Come home early."));
//
//       addItem(new CityDataItem("badhaee ho!","Congratulations! "));
//
//       addItem(new CityDataItem("kya vah vahaan gaya tha?","Did he go there? "));
//
//       addItem(new CityDataItem("kya tumane mujhe yaad kiya?","Did you miss me? "));
//
//       addItem(new CityDataItem("betuka mat bano.","Don't be absurd."));
//
//       addItem(new CityDataItem("use mat kholo.","Don't open that. "));
//
//       addItem(new CityDataItem("sab log muskura die.","Everyone smiled. "));
//
//       addItem(new CityDataItem("sabhee ne intajaar kiya.","Everyone waited."));
//
//       addItem(new CityDataItem("vah daudata hua aaya.","He came running."));
//
//       addItem(new CityDataItem("vah beemaar nahin ho sakata.","He can't be ill."));
//
//       addItem(new CityDataItem("usakee topee hai.","He has a hat on."));
//
//       addItem(new CityDataItem("vah arabee padhata hai.","He reads Arabic."));
//
//       addItem(new CityDataItem("vo mera pati hai.","He's my husband."));
//
//       addItem(new CityDataItem("sab kaise hain?","How is everyone?"));
//
//       addItem(new CityDataItem("kaisa chal raha hai?","How is it going?"));
//
//       addItem(new CityDataItem("aap kee umr kya hai?","How old are you?"));
//
//       addItem(new CityDataItem("um kaise asabhy ho!","How rude of you! "));
//
//       addItem(new CityDataItem("mainne raat ka khaana pakaaya.","I cooked dinner."));
//
//       addItem(new CityDataItem("mujhe ultee karane ka man kar raha hai.","I feel nauseous."));
//
//       addItem(new CityDataItem("main har saal jaata hoon.","I go every year. "));
//
//       addItem(new CityDataItem("mainne ek aavaaz sunee.","I heard a noise."));
//
//       addItem(new CityDataItem("main yah pasand hai.","I like this one."));
//
//       addItem(new CityDataItem("main pratidin daud lagaata hoon.","I run every day."));
//
//       addItem(new CityDataItem("mainne use phir se dekha.","I saw her again."));
//
//       addItem(new CityDataItem("mujhe ek gitaar chaahie.","I want a guitar. "));
//
//       addItem(new CityDataItem("mere saath maarapeet kee gaee."," I was assaulted."));
//
//       addItem(new CityDataItem("main ek achchha rasoiya hoon.","I'm a good cook."));
//
//       addItem(new CityDataItem("main aaj bhaagyashaalee hoon."," I'm lucky today."));
//
//       addItem(new CityDataItem("kya koee hai?","Is anybody here? "));
//
//       addItem(new CityDataItem("kya yah kaala nahin hai?","Is it not black? "));
//
//       addItem(new CityDataItem("kya koee kaiphe hai?"," Is there a cafe?"));
//
//       addItem(new CityDataItem("patang udaate hain.","Let's fly kites. "));
//
//       addItem(new CityDataItem("nahin, main nahin gaya.","No, I didn't go. "));
//
//       addItem(new CityDataItem("aasapaas koee nahin।","Nobody's around. "));
//
//       addItem(new CityDataItem("ab rona band karo.","Now stop crying."));
//
//       addItem(new CityDataItem("krpaya baith jao.","Please sit down."));
//
//       addItem(new CityDataItem("vah ek saundary hai.","She is a beauty."));
//
//       addItem(new CityDataItem("vah bahut baaten karatee hai.","She talks a lot. "));
//
//       addItem(new CityDataItem("yah uchit nahin hai.","That isn't fair. "));
//
//       addItem(new CityDataItem("vah meree galatee hai.","That's my fault. "));
//
//       addItem(new CityDataItem("kutta mera hai.","The dog is mine. "));
//
//       addItem(new CityDataItem("satta ke baahar.","The power's out. "));
//
//       addItem(new CityDataItem("ye pakshee hain.","These are birds."));
//
//       addItem(new CityDataItem("yah aapake lie hai.","This is for you."));
//
//       addItem(new CityDataItem("dhyaan se dekhen.","Watch carefully."));
//
//       addItem(new CityDataItem("hamaare paas kuchh nahin hai.","We lack nothing."));
//
//       addItem(new CityDataItem("kya samay hua hai?","What time is it?"));
//
//       addItem(new CityDataItem("tumhaaree umr kya hai?","What's your age?"));
//
//       addItem(new CityDataItem("meree kitaab kahaan hai?","Where's my book?"));
//
//       addItem(new CityDataItem("tumane mujhe chaunka diya!","You startled me!"));
//
//       addItem(new CityDataItem("aap ek vyakti hain.","You're a person."));
//
//       addItem(new CityDataItem("kya aap ek doktar hain?","Are you a doctor? "));
//
//       addItem(new CityDataItem("kya aap mujhe sikha sakate hain?","Can you teach me?"));
//
//       addItem(new CityDataItem("saavadhaanee se chunen.","Choose carefully."));
//
//       addItem(new CityDataItem("sheersh par chadhana.","Climb to the top."));
//
//       addItem(new CityDataItem("aao aur hamaare saath raho.","Come and join us."));
//
//       addItem(new CityDataItem("aao hamaare saath baitho.","Come sit with us. "));
//
//       addItem(new CityDataItem("kya aapake paas chaaval hai?","Do you have rice? "));
//
//       addItem(new CityDataItem("chehare mat banao.","Don't make faces."));
//
//       addItem(new CityDataItem("Don't make noise.","Don't make noise."));
//
//       addItem(new CityDataItem("aapaka samay achchha gujare.","Have a good time. "));
//
//       addItem(new CityDataItem("aap ka samay achchha ho.","Have a nice time."));
//
//       addItem(new CityDataItem("usake lambe pair hain.","He has long legs."));
//
//       addItem(new CityDataItem("vah usaka dost hai.","He is her friend."));
//
//       addItem(new CityDataItem("use santare pasand hain.","He likes oranges."));
//
//       addItem(new CityDataItem("He must love you.","He must love you."));
//
//       addItem(new CityDataItem("yahaan aapaka baig hai","Here is your bag. "));
//
//       addItem(new CityDataItem("mujhe yaad nahin aa raha hai.","I can't remember."));
//
//       addItem(new CityDataItem("main use nahin jaanata.","I don't know him. "));
//
//       addItem(new CityDataItem("mujhe ek samasya hai.","I have a problem."));
//
//       addItem(new CityDataItem("ab mujhe jaana hoga.","I have to go now. "));
//
//       addItem(new CityDataItem("main yahaan paas mein rahata hoon."," I live near here. "));
//
//       addItem(new CityDataItem("main apanee maan se pyaar karata hoon."," I love my mother."));
//
//       addItem(new CityDataItem("mujhe abhee jaana chaahie.","I must leave now."));
//
//       addItem(new CityDataItem("main bahut boodha nahin hoon.","I'm not very old."));
//
//       addItem(new CityDataItem("main bahut thak gaya hoon."," I'm really tired. "));
//
//       addItem(new CityDataItem("main bahut pyaas lagee"," I'm very thirsty."));
//
//       addItem(new CityDataItem("pahalee aprail hai.","It's April first. "));
//
//       addItem(new CityDataItem("ab meree baaree hai.","It's now my turn."));
//
//       addItem(new CityDataItem("mujhe dobaara prayaas karane den.","Let me try again. "));
//
//       addItem(new CityDataItem("aapase milakar achchha laga.","Nice to meet you. "));
//
//       addItem(new CityDataItem("kisee ne koee javaab nahin diya.","No one responded."));
//
//       addItem(new CityDataItem("krpya mera peechha karen."," Please follow me. "));
//
//       addItem(new CityDataItem("krpaya yahaan hastaakshar karen.","Please sign here."));
//
//       addItem(new CityDataItem("usane aapako dhokha diya.","She betrayed you."));
//
//       addItem(new CityDataItem("krpaya baith jaiye."," Sit down, please."));
//
//       addItem(new CityDataItem("gaadee taiyaar hai.","The car is ready."));
//
//       addItem(new CityDataItem("yah tumhaara kutta hai.","This is your dog."));
//
//       addItem(new CityDataItem("yah aapakee kunjee hai.","This is your key."));
//
//       addItem(new CityDataItem("yah sahee nahin hai.","This isn't right."));
//
//       addItem(new CityDataItem("ham khareedaaree karane gae the.","We went shopping."));
//
//       addItem(new CityDataItem("ham ghar ja rahe hain.","We're going home."));
//
//       addItem(new CityDataItem("ham jaldee mein hai.","We're in a hurry."));
//
//       addItem(new CityDataItem("vah pakshee kya hai?","What's that bird? "));
//
//       addItem(new CityDataItem("kahaanee kya hai?","What's the story? "));
//
//       addItem(new CityDataItem("umhaara naam kya hai?","tumhaara naam kya hai?"));
//
//       addItem(new CityDataItem("aap kahaan gae the?","Where did you go? "));
//
//       addItem(new CityDataItem("baar kahaan hai?","Where is the bar?"));
//
//       addItem(new CityDataItem("yah kisakee baaree hai?","Whose turn is it? "));
//
//       addItem(new CityDataItem("aap sahee ho sakate hain.","You may be right."));
//
//       addItem(new CityDataItem("kya aapakee aankhen kharaab hain?","Are your eyes bad? "));
//
//       addItem(new CityDataItem("pakshee ghonsale ka nirmaan karate hain.","Birds build nests."));
//
//       addItem(new CityDataItem("ladake to ladake rahengen.","Boys will be boys."));
//
//       addItem(new CityDataItem("kya main kuchh kar sakata hoon?","Can I do anything? "));
//
//       addItem(new CityDataItem("kya aap baahar nahin gae?","Didn't you go out? "));
//
//       addItem(new CityDataItem("kya aap mujh par vishvaas karate hain?","Do you believe me? "));
//
//       addItem(new CityDataItem("kya aap mujh par vishvaas karate hain?","kya aap mujh par vishvaas karate hain?"));
//
//       addItem(new CityDataItem("Don't deceive him. ","Everyone screamed. "));
//
//       addItem(new CityDataItem("He began to shout. ","vah chillaane laga."));
//
//       addItem(new CityDataItem("vah mujhe dekhane aaya tha.","He came to see me."));
//
//       addItem(new CityDataItem("vah naukaraanee ka kaam karatee hai.","He employs a maid. "));
//
//       addItem(new CityDataItem("vah naukaree ke baad hai.","He is after a job."));
//
//       addItem(new CityDataItem("vah ab chal raha hai.","He is walking now."));
//
//       addItem(new CityDataItem("unhonne videsh mein padhaee kee.","He studied abroad. "));
//
//       addItem(new CityDataItem("vah gaddaar nikala.","He turned traitor. "));
//
//       addItem(new CityDataItem("vah pahale se hee bacha hua hai.","He's already left."));
//
//       addItem(new CityDataItem("main pooree raat roya.","I cried all night. "));
//
//       addItem(new CityDataItem("mujhe bahut neend aaee.","I got very sleepy. "));
//
//       addItem(new CityDataItem("mujhe sir dard hai.","I have a headache."));
//
//       addItem(new CityDataItem("mere paas kuchh rupaye hai.","I have some money."));
//
//       addItem(new CityDataItem("main unase nahin mila hoon","I haven't met him."));
//
//       addItem(new CityDataItem("main sangeet sunata hoon.","I listen to music."));
//
//       addItem(new CityDataItem("mainne use daudate hue dekha.","I saw him running."));
//
//       addItem(new CityDataItem("main vaastav mein usase pyaar karata tha.","I truly loved her."));
//
//       addItem(new CityDataItem("main ek baink ke lie kaam karata hoon.","I work for a bank. "));
//
//       addItem(new CityDataItem("mujhe khushee ho rahee hai.","I'm getting happy."));
//
//       addItem(new CityDataItem("hindi","mujhe khushee ho rahee hai."));
//
//       addItem(new CityDataItem("main ek vidyaarthee nahin hoon."," I'm not a student."));
//
//       addItem(new CityDataItem("emapee 3 main aisa nahin hoon.","MP3 I'm not like that."));
//
//       addItem(new CityDataItem("main vaastav mein bhookha hoon.","I'm really hungry."));
//
//       addItem(new CityDataItem("mujhe sach batao.","Tell me the truth."));
//
//       addItem(new CityDataItem("usakee aankhen neelee hain.","She has blue eyes."));
//
//       addItem(new CityDataItem("vah gaane lagee.","She began to sing."));
//
//       addItem(new CityDataItem("apane haath oopar karo!","Put your hands up! "));
//
//       addItem(new CityDataItem("yah ab shuroo ho raha hai.","It's starting now."));
//
//       addItem(new CityDataItem("yah meree galatee nahin hai.","It's not my fault."));
//
//       addItem(new CityDataItem("yah ab shuroo ho raha hai.","It's starting now."));
//
//       addItem(new CityDataItem("mera baig choree ho gaya tha","My bag was stolen."));
//
//       addItem(new CityDataItem("ek baar phir se koshish karen.","Try it once again."));
//
//       addItem(new CityDataItem("ham use nahin jaanate.","We don't know her. "));
//
//       addItem(new CityDataItem("Wham use nahin jaanate.","We don't know him."));
//
//       addItem(new CityDataItem("hamaare paas achchhee khabar hai.","We have good news. "));
//
//       addItem(new CityDataItem("ham yuddh ke khilaaph hain.","We're against war."));
//
//       addItem(new CityDataItem("khushee kya hai?","What is happiness? "));
//
//       addItem(new CityDataItem("tumhaara naam kya he?","What is your name? "));
//
//       addItem(new CityDataItem("kya baat hai?","What's the matter?"));
//
//       addItem(new CityDataItem("aap kahaan rahate hain?","Where do you live? "));
//
//       addItem(new CityDataItem("kitaab kahaan hai?","Where is the book? "));
//
//       addItem(new CityDataItem("samudr tat kahaan hai?","Where's the beach? "));
//
//       addItem(new CityDataItem("yah paee kisane banaee?","Who made this pie? "));
//
//       addItem(new CityDataItem("tumhe jaana hoga.","You have to leave. "));
//
//       addItem(new CityDataItem("kya aaj aap vyast hain?","Are you busy today?"));
//
//       addItem(new CityDataItem("kya hamaaree koee baat ho sakatee hai?","Can we have a talk? "));
//
//       addItem(new CityDataItem("hamaare saath chalo.","Come along with us."));
//
//       addItem(new CityDataItem("kya aapako achchhee neend aaee?","Did you sleep well? "));
//
//       addItem(new CityDataItem("kya main aapako yaad hoon?","Do you remember me? "));
//
//       addItem(new CityDataItem("aasha mat chhodo.","Don't give up hope."));
//
//       addItem(new CityDataItem("patthar mat phenko.","Don't throw stones. "));
//
//       addItem(new CityDataItem("patthar mat phenko.","Don't throw stones. "));
//
//       addItem(new CityDataItem("patthar mat phenko.","Don't throw stones. "));
//
//       addItem(new CityDataItem("patthar mat phenko.","Don't throw stones. "));
//
//       addItem(new CityDataItem("hindi","Everyone likes him."));
//
//       addItem(new CityDataItem("har koee use pasand karata hai.","Everyone likes him."));
//
//       addItem(new CityDataItem("kya aap paagal ho gae hain?","Have you gone nuts? "));
//
//       addItem(new CityDataItem("unhonne gaharee saans lee.","He breathed deeply. "));
//
//       addItem(new CityDataItem("unhonne aankhen moond leen","He closed his eyes."));
//
//       addItem(new CityDataItem("vah phoot-phoot kar roya.","He cried and cried."));
//
//       addItem(new CityDataItem("vah ek saadhaaran aadamee hai.","He is a simple man."));
//
//       addItem(new CityDataItem("usaka aana nishchit hai.","He is sure to come."));
//
//       addItem(new CityDataItem("vah mera chachera bhaee nahin hai.","He isn't my cousin."));
//
//       addItem(new CityDataItem("usane apanee baaree ka intajaar kiya.","He waited his turn."));
//
//       addItem(new CityDataItem("vah ek baink mein kaam karata hai.","He works at a bank."));
//
//       addItem(new CityDataItem("vah ek achchha insaan hai.","He's a good person."));
//
//       addItem(new CityDataItem("main apanee galatee maanata hoon.","I admit my mistake."));
//
//       addItem(new CityDataItem("main angrejee padh sakata hoon.","I can read English."));
//
//       addItem(new CityDataItem("main is par vishvaas nahin kar sakata!","I can't believe it! "));
//
//       addItem(new CityDataItem("main vahee karata hoon jo mujhe bataaya jaata hai.","I do what I'm told."));
//
//       addItem(new CityDataItem("mainne use baahar jaane ke lie suna","I heard him go out."));
//
//       addItem(new CityDataItem("mujhe usaka pata maaloom hai.","I know her address."));
//
//       addItem(new CityDataItem("mujhe usaka pata maaloom hai.","I know his address."));
//
//       addItem(new CityDataItem("main un mahilaon ko jaanata hoon.","I know those women."));
//
//       addItem(new CityDataItem("main tumhaare pita ko jaanata hoon.","I know your father."));
//
//       addItem(new CityDataItem("main use pasand karata hoon.","I sort of like him. "));
//
//       addItem(new CityDataItem("main abhee bhee nahin jaanata.","I still don't know."));
//
//       addItem(new CityDataItem("mera janm 1960 mein hua tha","I was born in 1960. "));
//
//       addItem(new CityDataItem("main bahut pyaasa tha.","I was very thirsty."));
//
//       addItem(new CityDataItem("mai teliveezan dekhata hoon.","I watch television."));
//
//       addItem(new CityDataItem("mainne pooree raat kaam kiya.","I worked all night."));
//
//       addItem(new CityDataItem("main tumhe baad mein dekh loonga.","I'll see you later."));
//
//       addItem(new CityDataItem("main aap kee tarah lamba hoon.","I'm as tall as you."));
//
//       addItem(new CityDataItem("main ek baar mein aa raha hoon.","I'm coming at once."));
//
//       addItem(new CityDataItem("hindi","Is this book yours?"));
//
//       addItem(new CityDataItem("yah pahale se hee andhera hai.","It is already dark."));
//
//       addItem(new CityDataItem("yah barph jaisa dikhata hai.","It looks like snow."));
//
//       addItem(new CityDataItem("himapaat hone laga.","It started to snow."));
//
//       addItem(new CityDataItem("yah mera sootakes tha.","It was my suitcase."));
//
//       addItem(new CityDataItem("yah mazedaar tha.","It was sort of fun."));
//
//       addItem(new CityDataItem("yah bahut mahanga hai.","It's too expensive."));
//
//       addItem(new CityDataItem("yah yahaan bahut garm hai.","It's very hot here. "));
//
//       addItem(new CityDataItem("mujhe ise sambhaalane den.","Let me handle this."));
//
//       addItem(new CityDataItem("chalo ek tren lete hain.","Let's take a train."));
//
//       addItem(new CityDataItem("mera parivaar chhota hai.","My family is small."));
//
//       addItem(new CityDataItem("mere pair kee ungaliyaan jamee huee hain.","My toes are frozen."));
//
//       addItem(new CityDataItem("koee meree madad nahin kar sakata.","No one can help me."));
//
//       addItem(new CityDataItem("vah bahut sundar hai.","She is very pretty. "));
//
//       addItem(new CityDataItem("vah khushee ke maare uchhal padee.","She leaped for joy."));
//
//       addItem(new CityDataItem("vah khushee se muskuraee.","She smiled happily."));
//
//       addItem(new CityDataItem("vah doktar nahin hai.","She's not a doctor."));
//
//       addItem(new CityDataItem("va dokatar nahin hai.","That guy annoys me."));
//
//       addItem(new CityDataItem("ballebaaj baahar tha.","The batter was out."));
//
//       addItem(new CityDataItem("kaua ud gaya.","The crow flew away."));
//
//       addItem(new CityDataItem("bijalee chalee gaee.","The power went out."));
//
//       addItem(new CityDataItem("chor gaayab ho gaya.","The thief vanished."));
//
//       addItem(new CityDataItem("ye kutte bade hain.","These dogs are big."));
//
//       addItem(new CityDataItem("yah mairee ka kutta hai.","This is Mary's dog."));
//
//       addItem(new CityDataItem("kya unakee kahaanee sach thee?","Was his story true? "));
//
//       addItem(new CityDataItem("ham jaldee mein the.","We were in a hurry."));
//
//       addItem(new CityDataItem("ham bahut thak gae the.","We were very tired."));
//
//       addItem(new CityDataItem("ham achchhe dost hain.","We're good friends."));
//
//       addItem(new CityDataItem("kitana bada kaddoo hai!","What a big pumpkin! "));
//
//       addItem(new CityDataItem("samasya kya hai?","What's the problem? "));
//
//       addItem(new CityDataItem("yah kab shuroo hota hai?","When does it begin?"));
//
//       addItem(new CityDataItem("bachche kahaan hain?","Where are the kids?"));
//
//       addItem(new CityDataItem("hindi","english"));
//
//       addItem(new CityDataItem("Kapde sukha do.","Put the clothes to dry."));
//
//        addItem(new CityDataItem("Aaloo chheel do.","Peel off the potatoes"));
//
//        addItem(new CityDataItem("Santara Chheel do.","Peel off the Orange."));
//
//        addItem(new CityDataItem("Bistar laga do","Prepare the bed."));
//
//        addItem(new CityDataItem("Dhakkan khol do","Open the cover."));
//
//        addItem(new CityDataItem("Nal khol do.","Turn on the tap."));
//
//        addItem(new CityDataItem("Nal band kar do.","Turn off the tap."));
//
//        addItem(new CityDataItem("Chaadar bichha do.","Spread the bed sheet."));
//
//        addItem(new CityDataItem("Bistar par chaadar bichha do.","Spread the sheet on the bed."));
//
//        addItem(new CityDataItem("Deewar par sahaara mat lo.","Do not lean against the wall."));
//
//        addItem(new CityDataItem("Mujh par sahaara mat lo.","Do not lean against me."));
//
//        addItem(new CityDataItem("Mere kandhe par apna sir mat rakho.","Do not lean your head on my shoulder."));
//
//        addItem(new CityDataItem("Dimag se kam lo","Use your brain."));
//
//        addItem(new CityDataItem("Dheeme bolo.","Speak softly."));
//
//        addItem(new CityDataItem("Dheere bolo.","Speak slowly."));
//
//        addItem(new CityDataItem("Tez bolo.","Speak quickly."));
//
//        addItem(new CityDataItem("Ooncha bolo.","Speak aloud."));
//
//        addItem(new CityDataItem("Khaana  laga do.","Serve the food."));
//
//        addItem(new CityDataItem("Dabe paaon aao.","Walk on the tiptoe."));
//
//        addItem(new CityDataItem("Vo dabe paaon kamre me ghusa.","He tiptoed into the room."));
//
//        addItem(new CityDataItem("Mujh par ehsaan mat karo","Don’t favour me."));
//
//        addItem(new CityDataItem("Bahaane mat banao.","Don’t make excuses."));
//
//        addItem(new CityDataItem("Samay ki nazakat ko samjho.","Understand the delicacy of time."));
//
//        addItem(new CityDataItem("Apne baal bana lo","Comb you hair."));
//
//        addItem(new CityDataItem("Samajhne ki koshish karo.","Try to understand."));
//
//        addItem(new CityDataItem("Mujhe gussa mat dilao.","Don’t make me angry."));
//
//        addItem(new CityDataItem("Use samay lene do..","Let him take time."));
//
//        addItem(new CityDataItem("Aankh mat maro","Do not wink."));
//
//        addItem(new CityDataItem("Ishara mat karo.","Do not gesture."));
//
//        addItem(new CityDataItem("Bak bak mat karo.","Don’t prattle."));
//
//        addItem(new CityDataItem("Bakwaas mat karo.","Don’t talk nonsense."));
//
//        addItem(new CityDataItem("Zid mat karo.","Don’t be stubborn."));
//
//        addItem(new CityDataItem("Mujhse pange mat lo.","Do not mess with me."));
//
//        addItem(new CityDataItem("Dhoop sek lo","Bask in the sun."));
//
//        addItem(new CityDataItem("Rotiyaan bel lo.","Roll the chapatis."));
//
//        addItem(new CityDataItem("Roti kaise banaayein.","How to roll the chapati?"));
//
//        addItem(new CityDataItem("Aanta goonth lo","Knead the flour."));
//
//        addItem(new CityDataItem("Rotiyaan senk lo.","Bake the chapatis. "));
//
//        addItem(new CityDataItem("Joote pahan lo","Put on the shoes."));
//
//        addItem(new CityDataItem("Joote utaar lo.","Take off the shoes."));
//
//        addItem(new CityDataItem("Shirt pahan lo.","Wear the shirt."));
//
//        addItem(new CityDataItem("Shirt utaar lo","Take off the shirt."));
//
//        addItem(new CityDataItem("Dil pe mat lo.","Don’t take it to heart."));
//
//        addItem(new CityDataItem("Use vida kar do.","See him off"));
//
//        addItem(new CityDataItem("Use gali mat do.","Don’t abuse him."));
//
//        addItem(new CityDataItem("Andhera ho raha hai.","It’s getting dark."));
//
//        addItem(new CityDataItem("Andhera ho gaya hai.","It’s got dark."));
//
//        addItem(new CityDataItem("Mujhe nahane do.","Let me take a bath."));
//
//        addItem(new CityDataItem("aakar so jao.","Go and sleep."));
//
//        addItem(new CityDataItem("Mujhe thand lag rahi hai.","I’m feeling cold."));
//
//        addItem(new CityDataItem("Barish ho rahi hai","It’s raining."));
//
//        addItem(new CityDataItem("Phone aa raha hai.","The phone is ringing."));
//
//        addItem(new CityDataItem("Machine chaaloo karo.","Switch on the machine."));
//
//        addItem(new CityDataItem("Machine chalao.","Operate the machine."));
//
//        addItem(new CityDataItem("AC band karo.","Switch off the AC."));
//
//        addItem(new CityDataItem("AC ON karo.","Switch on the AC."));
//
//        addItem(new CityDataItem("Subah ho gayi.","It’s Morning."));
//
//        addItem(new CityDataItem("Mere saath chalo.","Come with me."));
//
//        addItem(new CityDataItem("(Use mat dekho.","Don’t look at him."));
//
//        addItem(new CityDataItem("Use mat ghooro","Don’t stare at him."));
//
//        addItem(new CityDataItem("Naukri kar lo.","Start a job."));
//
//        addItem(new CityDataItem("Naukri dhoond lo.","Find a job."));
//
//        addItem(new CityDataItem("Driving seekh lo.","Learn driving."));
//
//        addItem(new CityDataItem("Tum seekh jaoge.","You will learn."));
//
//        addItem(new CityDataItem("Tum me kala hai.","You have the art."));
//
//        addItem(new CityDataItem("India jeetegi.","India will win."));
//
//        addItem(new CityDataItem("Tum angrezi seekhoge.","You will learn English."));
//
//        addItem(new CityDataItem("Tum darpok ho.","You are coward."));
//
//        addItem(new CityDataItem("Nange pair mat chalo.","Don’t walk barefoot."));
//
//        addItem(new CityDataItem("Chalak mat bano.","Don’t be smart."));
//
//        addItem(new CityDataItem("Main Delhi se aa raha hun","I am coming from Delhi."));
//
//        addItem(new CityDataItem("Main Dehradun se aa raha hun.","I am coming from Dehradun."));
//
//        addItem(new CityDataItem("Ve park se aaye.","They came from park."));
//
//        addItem(new CityDataItem("Main kal se kaam karunga.","I will work from tomorrow."));
//
//        addItem(new CityDataItem("Ram das baje se kaam karega.","Ram will work from 10 ‘o’clock."));
//
//        addItem(new CityDataItem("Maine Ram se ye suna.","I heard it from Ram."));
//
//        addItem(new CityDataItem("Maine ye kitab se likha.","I wrote it from the book."));
//
//        addItem(new CityDataItem("Hum Uttarakhand se hai.","We are from Uttarakhand."));
//
//        addItem(new CityDataItem("Main 10 se 5 baje tak kaam karta hu.","I work from 10 to 5."));
//
//        addItem(new CityDataItem("Wo dukan se ye khareed raha hai.","He is buying it from the shop."));
//
//        addItem(new CityDataItem("Maine mobile ko bistar se uthaya.","I picked the mobile off the bed."));
//
//        addItem(new CityDataItem("Main screen se dhool hata raha hun.","I am wiping the dust off the screen."));
//
//        addItem(new CityDataItem("Bandar ped se kuda","Monkey jumped off the tree."));
//
//        addItem(new CityDataItem("Table se cup hata do.","Move the cup off the table."));
//
//        addItem(new CityDataItem("Patte ped se gir rahe hai.","Leaves are falling off the tree."));
//
//        addItem(new CityDataItem("vo bus se utar raha hai.","He is getting off the bus."));
//
//        addItem(new CityDataItem("Main subah se padh raha hun.","I have been studying since morning."));
//
//        addItem(new CityDataItem("Vo Somvar se koshish kar raha hai.","He has been trying since Monday."));
//
//        addItem(new CityDataItem("Ram 4 baje se ghum raha hai.","Ram has been walking since 4."));
//
//        addItem(new CityDataItem("Main subah se khel raha hun.","I have been playing since morning."));
//
//        addItem(new CityDataItem("Vo kal se yaha hai.","He has been here since yesterday."));
//
//        addItem(new CityDataItem("Neha dopahar se ro rahi hai.","Neha has been weeping since noon."));
//
//        addItem(new CityDataItem("Main tab se padh raha hun","I have been studying since then."));
//
//        addItem(new CityDataItem("Mummy 5 baje se ghar par hai.","Mom is at home since 5 o’clock."));
//
//        addItem(new CityDataItem("Main do ghante se padh raha hun.","I have been studying for 2 hours."));
//
//        addItem(new CityDataItem("Vo kai dino se koshish kar raha hai.","He has been trying for many days."));
//
//        addItem(new CityDataItem("Maine ye tumhare lie kiya.","I did it for you."));
//
//        addItem(new CityDataItem("Vo mere pas paise ke liye aaya.","He came to me for money."));
//
//        addItem(new CityDataItem("Maine 500 rupay mein mobile diya.","I gave a mobile for Rs. 500."));
//
//        addItem(new CityDataItem("Usne 5 rupay mein ek pen kharida.","He bought a pen for Rs. 5."));
//
//        addItem(new CityDataItem("Ram 2 ghante se ghum raha hai.","Ram has been walking for 2 hours."));
//
//        addItem(new CityDataItem("Main kafi der se khel raha hun.","I’ve been playing for a long."));
//
//        addItem(new CityDataItem("Wo 10 minute se yahan thi.","She had been here for 10 minutes."));
//
//        addItem(new CityDataItem("Neha 2 din se keh rahi hai.","Neha has been saying for 2 days."));
//
//        addItem(new CityDataItem("Main kai dino se padh raha hun.","I have been studying for many days."));
//
//        addItem(new CityDataItem("Mummy Kuch der se ghar par hai.","Mom is at home for a while."));
//
//        addItem(new CityDataItem("Main padhai ke liye Delhi ja raha hun.","I am going to Delhi for study."));
//
//        addItem(new CityDataItem("Wo paiso ke liye yaha aaya.","He came here for money."));
//
//        addItem(new CityDataItem("Us ladke ne ye tumhare liye kiya","That boy did it for you."));
//
//        addItem(new CityDataItem("Maine 500 rupay mein apna mobile diya.","I gave my mobile for Rs.500."));
//
//        addItem(new CityDataItem("Main January mein paida hua tha.","I was born in January."));
//
//        addItem(new CityDataItem("Wo 2015 mein ghar aayega.","He will come home in 2015."));
//
//        addItem(new CityDataItem("Maine june 2009 mein company chodi.","Maine june 2009 mein company chodi."));
//
//        addItem(new CityDataItem("Main aadhe ghante mein niklunga.","I will leave in half an hour."));
//
//        addItem(new CityDataItem("Main Delhi mein rehta hun.","I live in Delhi."));
//
//        addItem(new CityDataItem("Wo America mein padhai karega.","He will study in America."));
//
//        addItem(new CityDataItem("Mujhe is mobile mein gane nahi mile.","I found no songs in this mobile."));
//
//        addItem(new CityDataItem("Hamne ye kitab mein padha hai.","We have read it in the book."));
//
//        addItem(new CityDataItem("Ayansh aadhe ghante mein niklega.","Ayansh will leave in half an hour."));
//
//        addItem(new CityDataItem("Main bank mein kaam karta hun.","I work in a bank."));
//
//        addItem(new CityDataItem("Maine computer mein ye photo dekhi.","I saw this photograph in computer."));
//
//        addItem(new CityDataItem("Ye gaana tumhare mobile mein hai.","This song is there in your mobile."));
//
//        addItem(new CityDataItem("Coffee ko cup mein dalo","Pour the coffee into the cup."));
//
//        addItem(new CityDataItem("Wo kamre mein ja raha hai.","He is going into the room."));
//
//        addItem(new CityDataItem("Yeh train samay se pahale pahunchegi.","This train will reach before time."));
//
//        addItem(new CityDataItem("Main tumhare nikalne se pehle aunga.","I will come before you leave."));
//
//        addItem(new CityDataItem("Ab Main aapke samne khada hun.","Now I am standing before you."));
//
//        addItem(new CityDataItem("Wo apne papa ke samne baitha tha","He was sitting before his dad."));
//
//        addItem(new CityDataItem("Wo mere samne khada tha","He was standing before me."));
//
//        addItem(new CityDataItem("He was standing before me.","He was standing in front of me."));
//
//        addItem(new CityDataItem("Wo mere saamne tik nahi sakta.","He was standing before me."));
//
//        addItem(new CityDataItem("Wo mere saamne tik nahi sakta","He can’t stand in front of me."));
//
//        addItem(new CityDataItem("Main tumse 10 baje ke baad milunga.","I will meet you after 10."));
//
//        addItem(new CityDataItem("Main unke baad pahucha.","I reached after them."));
//
//        addItem(new CityDataItem("Main apne professor ke peeche pad gaya tha.","I was after my professor."));
//
//        addItem(new CityDataItem("Mere papa ne teen bar mana kar diya par main abhi bhi unke piche pada hua hun.","My father denied me thrice but I am still after him."));
//
//        addItem(new CityDataItem("Train samay ke baad pahuchegi.","The train will reach after time."));
//
//        addItem(new CityDataItem("Main tumhare jane ke baad aunga.","I will come after you leave."));
//
//        addItem(new CityDataItem("Wo Rahul se 10 baje ke baad mila.","He met Rahul after 10."));
//
//        addItem(new CityDataItem("Police chor ke piche padi hui hai.","The police are after the thief."));
//
//        addItem(new CityDataItem("Mujhe kisi ke dwara roka gaya.","I was stopped by someone."));
//
//        addItem(new CityDataItem("Use apne papa dwara bheja ja sakta hai.","He can be sent by his father."));
//
//        addItem(new CityDataItem("Maine bus se yatra ki.","I travelled by bus."));
//
//        addItem(new CityDataItem("Wo dopahar ki flight se aa raha hai","He is coming by noon flight."));
//
//        addItem(new CityDataItem("Main 4 baje tak nikal jaunga.","I will leave by 4 o’clock."));
//
//        addItem(new CityDataItem("Hum subah tak ye khatam kar denge","We will finish it by morning."));
//
//        addItem(new CityDataItem("Hume manager dwara suchit kiya gaya.","We were informed by the manager."));
//
//        addItem(new CityDataItem("Use mummy ke dwara danta gaya","He was scolded by mom."));
//
//        addItem(new CityDataItem("Main bike se gym ja raha tha","I was going to gym by bike."));
//
//        addItem(new CityDataItem("Hum ye subah tak nipta lenge","We will finish it by morning."));
//
//        addItem(new CityDataItem("Main shaam 7 baje tak gym jata hun.","I go to gym by 7 pm."));
//
//        addItem(new CityDataItem("Shaant rahiye","Be quiet."));
//
//        addItem(new CityDataItem("Tumhare pitaji kya kam karte hain?","What is your father?"));
//
//        addItem(new CityDataItem("Ram aaj kal kya kar raha hai?","What is Ram doing these days?"));
//
//        addItem(new CityDataItem("Samjhdaar ko ishara hi kafi hota hai.","A word to wise is enough."));
//
//        addItem(new CityDataItem("Main ek engineer hun","I am an engineer."));
//
//        addItem(new CityDataItem("Vah ek ladka hai.","That is a boy."));
//
//        addItem(new CityDataItem("Kya tumne koshish ki?","Did you try?"));
//
//        addItem(new CityDataItem("Tumne apne bhavishya ke liye kya socha hai?","What have you planned for your career?"));
//
//        addItem(new CityDataItem("Isme khaas baat kya hai?","What’s so special in it?"));
//
//        addItem(new CityDataItem("Aapki kripya hogi.","It’s kind of you."));
//
//        addItem(new CityDataItem("Yah table purani hai.","This table is old."));
//
//        addItem(new CityDataItem("Gopal mera mitr hai.","Gopal is my friend."));
//
//        addItem(new CityDataItem("Dance  kisne kiya?","Who danced?"));
//
//        addItem(new CityDataItem("Deharadun kon jaega?","Who will go to Dehradun?"));
//
//        addItem(new CityDataItem("Chaar din ki chandani fir andheri raat.","It’s a nine days wonder."));
//
//        addItem(new CityDataItem("Aap to bilkul bhole ho.","You are so innocent."));
//
//        addItem(new CityDataItem("Aapko kisse milna hai?","Who do you want to meet?"));
//
//        addItem(new CityDataItem("Mujhse kaun milna chahta hai?","Who wants to meet me?"));
//
//        addItem(new CityDataItem("Veh bada patthar dil hai.","He is a hard hearted person."));
//
//        addItem(new CityDataItem("Mamla bigad gaya hai.","The matter has become serious."));
//
//        addItem(new CityDataItem("Vah mera bhai hai.","He is my brother."));
//
//        addItem(new CityDataItem("Ye meri kitabein hain","These are my books."));
//
//        addItem(new CityDataItem("Tum daftar kaise jate ho?","How do you go to office?"));
//
//        addItem(new CityDataItem("Ab aapki tabiyat kaisi hai?","How are you now?"));
//
//        addItem(new CityDataItem("Yeh kaam krna koi baccho ka khel nahi hai","Doing this work is not a child’s play."));
//
//        addItem(new CityDataItem("Kya ye hai tumhare baat karne ka tareeka?","Is this the way you talk?"));
//
//        addItem(new CityDataItem("Yah meri ghadi hai.","This is my watch."));
//
//        addItem(new CityDataItem("Tum ek ladki ho.","You are a girl."));
//
//        addItem(new CityDataItem("Dehradun mein mausam kaisa hai? ","How is the weather in Dehradun?"));
//
//        addItem(new CityDataItem("Tumhare pitaji ki aayu kitani hai?","How old is your father?"));
//
//        addItem(new CityDataItem("Maine yeh baat nahi kahi.","I didn’t make this remark."));
//
//        addItem(new CityDataItem("Koi bhi aisa apmaan sahan nahi kar sakta","Nobody can bear such an insult."));
//
//        addItem(new CityDataItem("Vah sundar ladki thi.","She was a beautiful girl."));
//
//        addItem(new CityDataItem("Vah soya hua tha.","He was asleep."));
//
//        addItem(new CityDataItem("Karib 100 kilometer.","About 100 kilometers."));
//
//        addItem(new CityDataItem("Tumhen vahan pahunchane mein kitna Vakt lagega?","How long will you take to reach there?"));
//
//        addItem(new CityDataItem("Mai aapse bahut khush hun.","I am very happy with you."));
//
//        addItem(new CityDataItem("Mujhe tum par garv hai","I am proud of you."));
//
//        addItem(new CityDataItem("Mamta ek achchhi ladaki thi.","Mamta was a good girl."));
//
//        addItem(new CityDataItem("Mujhe Dehradun jaana hai.","I have to go to Dehradun."));
//
//        addItem(new CityDataItem("Veh mera door ka rishtedaar hai.","He is my distant relative."));
//
//        addItem(new CityDataItem("Mujhe neend aa rahi hai.","I am feeling sleepy."));
//
//        addItem(new CityDataItem("Tum kaun si film dekna pasand karogi ?","Which movie would you like to watch?"));
//
//        addItem(new CityDataItem("Tumhen kon sa gana sabse zyada pasand hai?","Which song do you like the most?"));
//
//        addItem(new CityDataItem("Mere bhai ko apna kaam pura karana hai.","My brother has to complete his work."));
//
//        addItem(new CityDataItem("Meri mataji ko khaana banana hai.","My mother has to cook the food."));
//
//        addItem(new CityDataItem("Ram kab padhta hai ?","When does Ram study?"));
//
//        addItem(new CityDataItem("Tumne seeta ko kab dekha?","When did you see Seeta?"));
//
//        addItem(new CityDataItem("Mai kal Apko fone karunga.","I will call you tomorrow."));
//
//        addItem(new CityDataItem("Is baat ko apne tak hi rakhna.","Keep it up to yourself."));
//
//        addItem(new CityDataItem("onali ko yahan aana hai.","Sonali has to come here."));
//
//        addItem(new CityDataItem("Mujhe kapde dhone hain","I have to wash the clothes."));
//
//        addItem(new CityDataItem("Apka bhai kahan kam karta hai?","Where does your brother work?"));
//
//        addItem(new CityDataItem("Apne ye pustak kahan se li?","Where did you take this book from?"));
//
//        addItem(new CityDataItem("Kya jhagada hai?","What’s the conflict?"));
//
//        addItem(new CityDataItem("Vo abhi abhi gaya hai.","He has just gone/left."));
//
//        addItem(new CityDataItem("Ravi ke paas 10 pen hain.","Ravi has 10 pens."));
//
//        addItem(new CityDataItem("Shyam ke do bhai hain.","Shyam has two brothers."));
//
//        addItem(new CityDataItem("Tum kal kahan jaogi ?","Where will you go tomorrow?"));
//
//        addItem(new CityDataItem("Tum aisi bakwas kyu karte ho?","Why do you talk such nonsense?"));
//
//        addItem(new CityDataItem("Aisi baat nahi hai.","It is nothing like that."));
//
//        addItem(new CityDataItem("Main nahi manta.","I don’t agree."));
//
//        addItem(new CityDataItem("Use bukhar hai.","He has fever."));
//
//        addItem(new CityDataItem("Hamare paas do dukanen hain.","We have two shops."));
//
//        addItem(new CityDataItem("Aaj tum school kyu nahi gaye?","Why did you not go to school today?"));
//
//        addItem(new CityDataItem("Kya hua?","What happened?"));
//
//        addItem(new CityDataItem("Zara mai Taiyaar Ho lu.","Let me get ready."));
//
//        addItem(new CityDataItem("Ghabrane ki baat nahi hai.","Not to worry."));
//
//        addItem(new CityDataItem("Tumhare paas bahut sadiyan hain.","You have many sarees."));
//
//        addItem(new CityDataItem("Hamen khana banana pada tha.","We had to cook the food."));
//
//        addItem(new CityDataItem("oshni ko geet gaana pada tha.","Roshni had to sing a song."));
//
//        addItem(new CityDataItem("Pitaji ko Delhi jana pada tha.","Father had to go to Delhi."));
//
//       addItem(new CityDataItem("Main bhi sath chalun?","May I accompany you? "));
//
//        addItem(new CityDataItem("Kya shyam aa raha hai?","Is Shyam coming?"));
//
//        addItem(new CityDataItem("Halanki mai soch rha tha.","Though, I was thinking."));
//
//        addItem(new CityDataItem("Isse behtar kuchh ho nhi sakta.","Nothing could be better than this."));
//
//        addItem(new CityDataItem("Hamen scooter thik karna pada tha.","We had to repair the scooter."));
//
//        addItem(new CityDataItem("Aapko turant yahan aana pada tha.","You had to come here immediately."));
//
//        addItem(new CityDataItem("Samajh gaye?","Understood?"));
//
//        addItem(new CityDataItem("Kya ram andar hai ?","Is Ram in?"));
//
//        addItem(new CityDataItem("Kuch cheejen humare bas me nahi hoti.","Few things are not in our control."));
//
//        addItem(new CityDataItem("Use mehanat karni padegi.","He will have to work hard."));
//
//        addItem(new CityDataItem("Use mafi mangni padegi.","He will have to say sorry."));
//
//        addItem(new CityDataItem("Mera bhai padh raha hai.","My brother is studying."));
//
//        addItem(new CityDataItem("Ve bazar ja rahe hain.","They are going to market."));
//
//        addItem(new CityDataItem("Aap kab aaye?","When did you come?"));
//
//        addItem(new CityDataItem("Mera ek kam karoge?","Would you do me a favor please?"));
//
//        addItem(new CityDataItem("Maine tumhare saath bahut bura kiya.","I really did wrong to you."));
//
//        addItem(new CityDataItem("Aakhir chal kya raha hai?","What exactly is going on?"));
//
//        addItem(new CityDataItem("Computer chalu karen kya?","Do/shall we switch on the computer?"));
//
//        addItem(new CityDataItem("Kya tumhen pata hai?","Do you know?"));
//
//        addItem(new CityDataItem("Tum kaayer ho.","You are coward."));
//
//        addItem(new CityDataItem("Ab vo kaam se bhaag nahi sakta","He can’t shirk the work now."));
//
//        addItem(new CityDataItem("Ham nashta kar rahe hain.","We are taking breakfast."));
//
//        addItem(new CityDataItem("Vah Naha raha hai.","He is taking a bath."));
//
//        addItem(new CityDataItem("Aap mujhse naraaz hain kya ?","Are you annoyed with me?"));
//
//        addItem(new CityDataItem("Bataiye main aapki kya seva kr sakta hu?","Tell me, how can I help you?"));
//
//        addItem(new CityDataItem("Yeh kameez maili hai","This shirt is dirty."));
//
//        addItem(new CityDataItem("Yeh kameez fati hui hai.","This shirt is torn."));
//
//        addItem(new CityDataItem("Bobby abhi aaya hai.","Bobby has just arrived."));
//
//        addItem(new CityDataItem("Usne tumhen ek gift bheja hai.","He has sent you a gift."));
//
//        addItem(new CityDataItem("Yah kiska Mobile Number hai ?","Whose mobile number is this?"));
//
//        addItem(new CityDataItem("Tum kab miloge ?","When will you meet?"));
//
//        addItem(new CityDataItem("Veh tumhare jesi dikhti hai.","She looks like you."));
//
//        addItem(new CityDataItem("Kisi se kuch mat managna.","Don’t ask anything from anybody. "));
//
//        addItem(new CityDataItem("Ham cricket khel chuke hain.","We have played cricket.     "));
//
//        addItem(new CityDataItem("Vah apni ichhayen puri kar chuka hai.","He has fulfilled his desires."));
//
//        addItem(new CityDataItem("Ab apke pitaji kaise hain?","How is your father now?"));
//
//        addItem(new CityDataItem("Sabse achchhi shart kon si hai?","Which Shirt is the best?"));
//
//        addItem(new CityDataItem("Tumne mujhe jagaya kyo nahi?","Why didn’t you wake me up?"));
//
//        addItem(new CityDataItem("Mere pass 20 rupaye kam hain","I am short by twenty rupees."));
//
//        addItem(new CityDataItem("Main raat mein der se soya tha.","I slept late last night."));
//
//        addItem(new CityDataItem("Tumane hamesha mujhe danta","You always scolded me."));
//
//        addItem(new CityDataItem("Yah shurt kitne ki hai ?","What is the cost of this shirt?"));
//
//        addItem(new CityDataItem("Kitne din lagenge?","How long will it take?"));
//
//        addItem(new CityDataItem("Khelte hue tang par chot lag gayi.","I hurt my leg while playing."));
//
//        addItem(new CityDataItem("Uski naak beh rahi hai.","His nose is running."));
//
//        addItem(new CityDataItem("Binita ne madhur geet gaya.","Binita sang a sweet song."));
//
//        addItem(new CityDataItem("Uska kal accident ho gaya","He met with an accident yesterday."));
//
//        addItem(new CityDataItem("Main aapse kuchh puchh raha hun.","I am asking you something."));
//
//        addItem(new CityDataItem("kahne ki zarurat nahi ki vo pagal hai.","Needless to say that he is mad."));
//
//        addItem(new CityDataItem("puchne ki zarurat nahi, vo pahle se jaanta hai","Needless to ask, he already knows."));
//
//        addItem(new CityDataItem("ye laabhdayak nahi hai.","It’s not worthwhile."));
//
//        addItem(new CityDataItem("kya vahan jaana faaydemand hai?","Is it worthwhile going there? "));
//
//        addItem(new CityDataItem("Ram bahut der baad aaya","Ram came after a long."));
//
//        addItem(new CityDataItem("Vo bahut der baad aaya tha.","He had come after a long."));
//
//        addItem(new CityDataItem("maine chain kee saans lee.","I sighed of relief."));
//
//        addItem(new CityDataItem("Tum ab chain kee saans le sakte ho.","Now you can sigh of relief"));
//
//        addItem(new CityDataItem("Tum mujhe Ram ki yaad dilate ho.","You remind me of Ram."));
//
//        addItem(new CityDataItem("Tumhara chehra mujhe kisi ki yaad dilata hai.","Your face reminds me of someone."));
//
//        addItem(new CityDataItem("Mere mama ne tumhe paala","My maternal uncle brought you up."));
//
//        addItem(new CityDataItem("Main delhi me palaa badhaa.","I was brought up in Delhi."));
//
//        addItem(new CityDataItem("Usne socha or sach kar diya.","He thought and materialized."));
//
//        addItem(new CityDataItem("Main sapne saakaar kar dunga.","I will materialize the dreams."));
//
//        addItem(new CityDataItem("Main hamesha tumhara saath deta hu.","I always stand by you."));
//
//        addItem(new CityDataItem("Usne mera saath diya tha","He had stood by me."));
//
//        addItem(new CityDataItem("Vo hakla raha tha","He was stammering."));
//
//        addItem(new CityDataItem("Rahul haklaata hai","Rahul stammers."));
//
//        addItem(new CityDataItem("Kya aap meri baat sun rahe ho?","Are you listening to me?"));
//
//        addItem(new CityDataItem("Mai kya-kya kha sakata hun?","What all can I eat?"));
//
//        addItem(new CityDataItem("Aajkal kaam bahut hai.","There is huge work pressure these days."));
//
//        addItem(new CityDataItem("Ladke chay pee rahe the.","The boys were taking tea."));
//
//        addItem(new CityDataItem("Main tumhara intejar kar rahi thi","I was waiting for you."));
//
//        addItem(new CityDataItem("Yahi Mobile main chahata tha.","This is the very mobile, I want."));
//
//        addItem(new CityDataItem("Ye meri books hai, ve tumhari books hai.","These are my books, those are yours."));
//
//        addItem(new CityDataItem("Maine pakka man bana liya hai ki mai jaunga.","I am determined to go."));
//
//        addItem(new CityDataItem("Wah aaj kal mauj mai hai","He is enjoying these days."));
//
//        addItem(new CityDataItem("Tum table saaf kar rahe the","You were cleaning the table."));
//
//        addItem(new CityDataItem("Mere mitra doshi the.","My friends were guilty."));
//
//        addItem(new CityDataItem("Hamne shimla me khub aanand liya.","We enjoyed a lot in Shimla."));
//
//        addItem(new CityDataItem("Tumhare rukhe vyavhar se use chot  pahunchi hai.","Your rude behavior has hurt him."));
//
//        addItem(new CityDataItem("Main aaj hi naukri par aaya hun.","I have joined today only."));
//
//        addItem(new CityDataItem("In sab files ko lekar aao.","Bring all these files."));
//
//        addItem(new CityDataItem("Main kal bajar jaunga","I will go to market tomorrow."));
//
//        addItem(new CityDataItem("Chaprasi kamre ki safai karega.","The peon will clean the room."));
//
//        addItem(new CityDataItem("Ye kitaab kisaki hai ?","Whose is this book?"));
//
//        addItem(new CityDataItem("Apse ye ummid nahi thi.","I didn’t expect it from you."));
//
//        addItem(new CityDataItem("Apka T.V band hai","Your TV is off."));
//
//        addItem(new CityDataItem("Ham raat ko soyenge.","We will sleep at night."));
//
//        addItem(new CityDataItem("Main aaj yah pustak padhunga.","I will read this book today."));
//
//        addItem(new CityDataItem("Darvaje pe kaun khada hai?","Who is standing at the door?"));
//
//        addItem(new CityDataItem("Mai tum par bharosa kaise kar sakta hun ?","How can I trust you?"));
//
//        addItem(new CityDataItem("Hum rasta bhul gaye.","We have lost our way."));
//
//        addItem(new CityDataItem("Yatra karte samaye kam saman lekar jana chahiye.","You should travel light."));
//
//        addItem(new CityDataItem("Vah kal school ja raha hoga.","He will be going to school tomorrow."));
//
//        addItem(new CityDataItem("Vah aaj aa raha hoga.","He would be coming today."));
//
//        addItem(new CityDataItem("Glass mein thoda paani aur dalo.","Pour some more water into the glass."));
//
//        addItem(new CityDataItem("Patr daak dvara bheja gaya.","Letter was sent by post."));
//
//        addItem(new CityDataItem("Motor cycle ka agla pahiya panchar hai.","The front tyre of the bike is punctured/flat."));
//
//        addItem(new CityDataItem("Apko pata hai kal mujhe Riya mili thi","You know what, I met Riya yesterday."));
//
//        addItem(new CityDataItem("Apne kamre mein jao or intzaar karo.","Go to your room and wait there."));
//
//        addItem(new CityDataItem("Apne kamre mein jao or intzaar karo.","Go to your room and wait there."));
//
//        addItem(new CityDataItem("Kripya mere liye ek gilas paani laiye","Please bring a glass of water for me."));
//
//        addItem(new CityDataItem("Shyam tumhare peechhe khada tha.","Shyam was standing behind you."));
//
//        addItem(new CityDataItem("Kalam mej par hai.","Pen is on the table."));
//
//        addItem(new CityDataItem("Mujhe kisi tarah pata chal gaya.","I somehow got to know about it."));
//
//        addItem(new CityDataItem("Main kuch keh rahi hun","I’m saying something."));
//
//        addItem(new CityDataItem("Apne dant achchhi tarah saaf Karen.","Clean your teeth well."));
//
//        addItem(new CityDataItem("Apne svaasth ka dhyan rakhen.","Take care of your health."));
//
//        addItem(new CityDataItem("Kitaab takie ke niche hai.","Book is beneath/underneath the pillow."));
//
//        addItem(new CityDataItem("Mere pita ki jagah koi nahi le sakata.","Nobody can replace my father."));
//
//        addItem(new CityDataItem("Spoken English Guru channel lagana.","Tune to Spoken English Guru channel."));
//
//        addItem(new CityDataItem("Tumne use kya bataya?","What did you tell him?"));
//
//        addItem(new CityDataItem("Kya tumne kuch kaha?","Did you say something?"));
//
//        addItem(new CityDataItem("Das bajkar panch minat huye hain.","It is five past ten."));
//
//        addItem(new CityDataItem("Meri ghadi tez chal rahi hai.","My watch is running fast."));
//
//        addItem(new CityDataItem("Khud ke lie to har koi karata hai.","Obviously, everybody does for himself."));
//
//        addItem(new CityDataItem("Tum mujhe naraz nahin ho na?","You are not angry with me, are you?"));
//
//        addItem(new CityDataItem("Tum kahan kuch kehti ho.","You hardly ever speak."));
//
//        addItem(new CityDataItem("Kahin ghoomne jaane ka man kar raha hai.","I feel like going somewhere."));
//
//        addItem(new CityDataItem("Achchha samay aayega.","Better time will come."));
//
//        addItem(new CityDataItem("Baadal garaz rahe hain.","Clouds are thundering."));
//
//        addItem(new CityDataItem("Aaj ke baad vo tumhen kabhi chot nahin pahunchayega.","Now onwards, he will never hurt you."));
//
//        addItem(new CityDataItem("Main tumhen jane nahin dunga.","I will not let you go."));
//
//        addItem(new CityDataItem("Man to kiya use ek thappad laga don.","I felt like slapping him."));
//
//        addItem(new CityDataItem("Tumne abhi kiska naam liya?","Whose name did you take?"));
//
//        addItem(new CityDataItem("Main ek ghanta padhta hun.","  I study for an hour."));
//
//        addItem(new CityDataItem("Vah apna samay vyarth karta hai.","He wastes his time."));
//
//        addItem(new CityDataItem("umhen aisa nahi kahna chahie tha.","You shouldn’t have said so."));
//
//        addItem(new CityDataItem("Main jana to chahta hu par ja nahi sakta.","I want to go but I can’t."));
//
//        addItem(new CityDataItem("Din pratidin garmi badh rahi hai.","It’s getting hotter day by day."));
//
//        addItem(new CityDataItem("Aap bilkul samay par aaye hain.","You are just in time."));
//
//        addItem(new CityDataItem("Batao, mujhe kya karna chaahie?","Tell me, what should I do?"));
//
//        addItem(new CityDataItem("Vo Delhi se abhi-2 aaya hai.","He has just come from Delhi."));
//
//        addItem(new CityDataItem("Kya Ram achchha hai?","Is Ram good?"));
//
//        addItem(new CityDataItem("Bachche kiske saath hai?","With whom are children?"));
//
//        addItem(new CityDataItem("Tum achchhe ho.","You are good."));
//
//        addItem(new CityDataItem("Papa Rahul ke saath the","Papa was with Rahul."));
//
//        addItem(new CityDataItem("Bachcha mere aage tha.","The child was ahead of me."));
//        addItem(new CityDataItem("Ye uska dost nahi hai.","This is his friend."));
//
//        addItem(new CityDataItem("Ye ladka kahan par tha?","Where was this boy?"));
//
//        addItem(new CityDataItem("Main Ram ki vajah se yahan hoon.","I am here because of Ram."));
//
//        addItem(new CityDataItem("Uske pass pen tha.","He had a pen."));
//
//        addItem(new CityDataItem("Tumhare pass kya hai?","What do you have?"));
//
//       addItem(new CityDataItem("Mammi ke pass paise nahi hai.","Mom doesn’t have money."));
//
//       addItem(new CityDataItem("Rahul kiska bhai hai?","Whose brother is Rahul?"));
//
//       addItem(new CityDataItem("Ye aadmi kis ladki ka papa hai?","Which girl’s father is this man?"));
//
//       addItem(new CityDataItem("Vo ghar kiska hai?","Whose is that house/home?"));
//
//       addItem(new CityDataItem("Main tumse lamba hoon.","I am taller than you."));
//
//       addItem(new CityDataItem("Tum kis shahar se ho?","Which city are you from?"));
//
//       addItem(new CityDataItem("Tum kis shahar mein ho?","Which city are you in?"));
//
//       addItem(new CityDataItem("Kya tumhare paas hai?","Do you have?"));
//
//       addItem(new CityDataItem("Tumhare paas kya nahi hai?","What do you not have?"));
//
//       addItem(new CityDataItem("Kya tumhare paas mobile hai?","Do you have a mobile?"));
//
//       addItem(new CityDataItem("Main kaun hoon?","Who am I?"));
//
//       addItem(new CityDataItem("Kya hai vo?","What is that?"));
//
//       addItem(new CityDataItem("Mere peechhe kaun khada tha?","Who was standing behind me?"));
//
//       addItem(new CityDataItem("Main class mein baitha hoon.","I am sitting in the class."));
//
//       addItem(new CityDataItem("Uske bhai kitne bade hain?","How old are his brothers?"));
//
//       addItem(new CityDataItem("Tum mere sabse chhote bhai ho.","You are my youngest brother."));
//
//       addItem(new CityDataItem("Ye tumhare liye mera pyaar hai.","This is my love for you."));
//
//       addItem(new CityDataItem("Kya hai uska naam?","What is his name?"));
//
//       addItem(new CityDataItem("Ye kahani kisi aur ki hai.","This story is someone else’s."));
//
//       addItem(new CityDataItem("Vo thakee hui thi.","She was tired."));
//
//       addItem(new CityDataItem("Ram soya hua hai.","Ram is asleep."));
//
//       addItem(new CityDataItem("Hum baithe hue the","We were sitting."));
//
//       addItem(new CityDataItem("Tum khade kyun ho?","Why are you standing?"));
//
//       addItem(new CityDataItem("Us table par kya hai?","What is there on that table?"));
//
//       addItem(new CityDataItem("Tum Delhi ke aas paas ho.","You are near about Delhi."));
//
//       addItem(new CityDataItem("Main is photo mein nahi hoon.","I am not there in this photograph."));
//
//       addItem(new CityDataItem("Vo kab se office mein hai?","Since when is he there in office?"));
//
//       addItem(new CityDataItem("Tum kab tak office mein the?","Until when were you there in office?"));
//
//       addItem(new CityDataItem("Mere pair mein kya hai?","What is there in my leg?"));
//
//       addItem(new CityDataItem("Uske paas kuch nahi hai.","He doesn’t have anything"));
//
//       addItem(new CityDataItem("Mere paas kuch phate hue kapde hain.","I have some torn clothes."));
//
//       addItem(new CityDataItem("Ram ped ke peeche chipa hua tha.","Ram was hidden behind the tree."));
//
//       addItem(new CityDataItem("Ye bachche mere hai.","These children are mine."));
//
//       addItem(new CityDataItem("Yah tumhara nahi hai.","This is not yours."));
//
//       addItem(new CityDataItem("Ye meri billi hai.","his is my cat."));
//
//       addItem(new CityDataItem("Ye billi meri hai.","This cat is mine."));
//
//       addItem(new CityDataItem("Ye ram ki kitab hai.","This is Ram’s book."));
//
//       addItem(new CityDataItem("Ye kitab ram ki hai.","This book is Ram’s."));
//
//       addItem(new CityDataItem("Hum tumhare hain.","We are yours."));
//
//       addItem(new CityDataItem("Main har pal tumhare sath tha.","I was there with you every moment."));
//
//       addItem(new CityDataItem("Gadi me kitna petrol hai?","How much petrol is there in the car?"));
//
//       addItem(new CityDataItem("Tumhare pass kitna paisa hai?","How much money do you have?"));
//
//       addItem(new CityDataItem("kis shahar me ho tum is vakt?","Which city are you in right now?"));
//
//       addItem(new CityDataItem("Mai sirf tumhare liye zinda hoon.","I am alive only for you."));
//
//       addItem(new CityDataItem("Ram kahi khoya hua tha.","Ram was lost somewhere."));
//
//       addItem(new CityDataItem("Main tumhare sapno me khoya hua hoon.","I am lost in your dreams."));
//
//       addItem(new CityDataItem("Mobile table par rakha hua hai.","Mobile is kept on the table."));
//
//       addItem(new CityDataItem("Mai dara hua tha.","I was scared."));
//
//       addItem(new CityDataItem("Kitne bachche is samay yahan hai?","How many children are here at this time?"));
//
//       addItem(new CityDataItem("Ram 2:00 baje jaga hua tha.","Ram was awake at 2."));
//
//       addItem(new CityDataItem("Ram 2:00 baje se jaga hua tha.","Ram had been awake since 2."));
//
//       addItem(new CityDataItem("Uske papa piye hue the.","His father was drunk."));
//
//       addItem(new CityDataItem("Tum mere kareebi dost ho.","You are my close friend."));
//
//       addItem(new CityDataItem("Ye likha hua tha.","It was written."));
//
//       addItem(new CityDataItem("Ye geeta me likha hua hai.","It is written in the Bhagavad Geeta."));
//
//       addItem(new CityDataItem("Bhikhari ke kapde phate hue the.","The beggar’s clothes were torn."));
//
//       addItem(new CityDataItem("Kya tumhare pass kuch tha?","Did you have something?"));
//
//       addItem(new CityDataItem("Hamare paas kuch hai.","We have something."));
//
//       addItem(new CityDataItem("Vo tumhare liye ruka hua hai.","He is waiting for you."));
//
//       addItem(new CityDataItem("Tum ghar ke andar the.","You were inside the house."));
//
//       addItem(new CityDataItem("Ram mere bagal main khada hai.","Ram is standing beside me."));
//
//       addItem(new CityDataItem("Shiv kee pooja yahan prasiddh hai.","The worship of Lord Shiva is famous here."));
//
//       addItem(new CityDataItem("Main zimmedariyon se kabhi jee nahi churata.","Sindh"));
//
//       addItem(new CityDataItem("Karachi","I never shirk the responsibilities."));
//
//       addItem(new CityDataItem("Main kaam se bhaag nahi raha hu","I am not shirking the work."));
//
//       addItem(new CityDataItem("Vipatti insan ke dhairya ko parakhti hai.","Adversity tries one’s patience."));
//
//       addItem(new CityDataItem("Aj mera tumse milne ka irada hai.","I intend to meet you today."));
//
//       addItem(new CityDataItem("Vo tumhe dhokha dene ki sochta hai.","He intends to cheat you."));
//
//       addItem(new CityDataItem("Is road ne hamari journey ko chhota kar diya.","This road shortened our journey."));
//
//       addItem(new CityDataItem("Is lakdi ko chhota kar do.","Shorten this stick."));
//
//       addItem(new CityDataItem("Main iska aadi nahi hona chahta.","I don’t want to be addicted to it."));
//
//       addItem(new CityDataItem("Wo cigarette peene ka aadi ho gaya hai.","He is addicted to smoking."));
//
//       addItem(new CityDataItem("Kya khushboo hai!","What a fragrance!"));
//
//       addItem(new CityDataItem("Is phool ki khushboo bahut achchhi hai.","The fragrance of this flower is very nice."));
//
//       addItem(new CityDataItem("Hamari khvahishein itni kyon hai?","Why are our desires these many?"));
//
//       addItem(new CityDataItem("Tum aise kyon ho?","Why are you so?"));
//
//       addItem(new CityDataItem("Paise kiske paas hai?","Who has money?"));
//
//       addItem(new CityDataItem("kya tumhare pass dimaag nahi hai?","Do you not have brain?"));
//
//       addItem(new CityDataItem("Ye toota hua dil mera hai.","This broken heart is mine."));
//
//       addItem(new CityDataItem("Uske kitne ladke hai?","How many sons does he have?"));
//
//       addItem(new CityDataItem("Aap mujhse jyada bure hain.","You are worse than I."));
//
//       addItem(new CityDataItem("(kya Ram mujhse jyada acha hai?","Is Ram better than me?"));
//
//       addItem(new CityDataItem("Mujhe tumse pyaar hai.","I am in love with you."));
//
//       addItem(new CityDataItem("Itne sare paise tumhare paas kaise hai?","How do you have this much money?"));
//
//       addItem(new CityDataItem("Rishte khoobsurat hote hai.","Relations are beautiful."));
//
//       addItem(new CityDataItem("Ye koi aur hai.","This is someone else."));
//
//       addItem(new CityDataItem("Ye kuch aur hai.","This is something else."));
//
//       addItem(new CityDataItem("Tumhara pen kaun sa vala hai?","Which one is your pen?"));
//
//       addItem(new CityDataItem("Ye kiska pen hai?","Whose is this pen?"));
//
//       addItem(new CityDataItem("Tumhare peechhe kaun hai?","Who is there behind you?"));
//
//       addItem(new CityDataItem("Paise kiske pass nahi hain?","Who doesn’t have money?"));
//
//       addItem(new CityDataItem("Tum kis baat ke liye dukhi ho?","What are you sad for?"));
//
//       addItem(new CityDataItem("Ram kab tak is jagah mein tha?","Until when was Ram here in this place?"));
//
//       addItem(new CityDataItem("Main tumhare saamne khada tha.","I was standing in front of you."));
//
//       addItem(new CityDataItem("Main theek tumhare saamane khada tha.","I was standing just in front of you."));
//
//       addItem(new CityDataItem("Kis ladki ke papa wahaan khade the?","Which girl’s father was standing there?"));
//
//       addItem(new CityDataItem("Main guitaar ke liye pagal hoon.","I am crazy for guitar."));
//
//       addItem(new CityDataItem("Vahan kitne log hai?","How many people are there?"));
//
//       addItem(new CityDataItem("Pen kahan rakha hua hai?","Where is the pen kept?"));
//
//       addItem(new CityDataItem("Samay kya hua hai?","What is the time?"));
//
//       addItem(new CityDataItem("Tum dono sabse ache ho.","You both are the best."));
//
//       addItem(new CityDataItem("Hum sab tumhare saath hain.","We all are with you."));
//
//       addItem(new CityDataItem("Main tumhara kaun hoon?","Who am I to you?"));
//
//       addItem(new CityDataItem("Mere saath raho","Be with me."));
//
//       addItem(new CityDataItem("Apne dosto se baat karo.","Talk to your friends."));
//
//       addItem(new CityDataItem("Kisi dost ko mat chhodo.","Don’t leave any friend."));
//
//       addItem(new CityDataItem("Mere baare mein socho","Think about me."));
//
//       addItem(new CityDataItem("(Mujhe tumhe kuch batane do.","Let me tell you something."));
//
//       addItem(new CityDataItem("Is pareshanee ka hal nikalo.","Find out the solution of this problem."));
//
//       addItem(new CityDataItem("Mujhe dekhne do.","Let me see."));
//
//       addItem(new CityDataItem("Naak saaf karo.","Blow your nose."));
//
//       addItem(new CityDataItem("Kabhi-kabhi ghar aaya karo.","Drop in home sometimes."));
//
//       addItem(new CityDataItem("Use ek inch bhi mat hilne do.","Don’t let him move even an inch."));
//
//       addItem(new CityDataItem("Hamesha samay ke paaband raho.","Always be punctual."));
//
//       addItem(new CityDataItem("Aise chalaak aadmee se saavdhaan raho.","Beware of such a clever man."));
//
//       addItem(new CityDataItem("Apni kameej ke button band karo.","Button up your shirt."));
//
//       addItem(new CityDataItem("Vivek ko un logo se mat milne do.","Don’t let Vivek meet those people."));
//
//       addItem(new CityDataItem("Kripya darvaaje kee kundee laga do.","Kindly bolt the door."));
//
//       addItem(new CityDataItem("Kaam se jee mat churao","Don’t shirk the work."));
//
//       addItem(new CityDataItem("Use dhundhne do.","Let him find out / search."));
//
//       addItem(new CityDataItem("Use pareshaan mat karo","Don’t bother him."));
//
//       addItem(new CityDataItem("Apni car yaha khadi mat karo.","Don’t park your car here."));
//
//       addItem(new CityDataItem("Use ye mat karne do.","Don’t let him do this."));
//
//       addItem(new CityDataItem("Apne mata-pita ko dekhne jao.","Go to see your parents."));
//
//       addItem(new CityDataItem("Us ladke ke saath thahro.","Stay with that boy."));
//
//       addItem(new CityDataItem("Gareebo ki madad karo.","Help the poor."));
//
//       addItem(new CityDataItem("Is ladki ko yaha kaam karne do.","Let this girl work here."));
//
//       addItem(new CityDataItem("Sabhi kapde press(istree) kar do.","Iron all the clothes."));
//
//       addItem(new CityDataItem("Jimmedariyo se ji mat churao.","Don’t shirk responsibilities."));
//
//       addItem(new CityDataItem("Baal bana lo.","Comb the hair."));
//
//       addItem(new CityDataItem("Unhen jane do.","Let them go."));
//
//       addItem(new CityDataItem("Thoda pani aur mila lo.","Add a little more water."));
//
//       addItem(new CityDataItem("kripya namak pass karo.","Pass the salt please."));
//
//       addItem(new CityDataItem("Samay dekho.","Look at the time."));
//
//       addItem(new CityDataItem("Yahaan mat utro.","Don’t get off here."));
//
//       addItem(new CityDataItem("Hamein padhne do kyonki kal hamara paper hai.","Let us study as it is our paper tomorrow."));
//
//       addItem(new CityDataItem("Mombattee bujha do.","Blow out the candle."));
//
//       addItem(new CityDataItem("Sabko pyar karo jo koi tumharee jindagi mein aaye","Love everyone whoever comes in your life."));
//
//       addItem(new CityDataItem("Apna hisaab kar lo.","Clear your accounts."));
//
//       addItem(new CityDataItem("Neele pen se mat likhiye.","Don’t write with a blue pen."));
//
//       addItem(new CityDataItem("(Yahaan se chale jao.","Go away from here."));
//
//       addItem(new CityDataItem("Is car se bahar nikal jao.","Sindh"));
//
//       addItem(new CityDataItem("Is car se bahar nikal jao.","Get out of this car."));
//
//       addItem(new CityDataItem("Khach-pach mat likho, saaf-saaf likho","Do not scribble, write legibly."));
//
//       addItem(new CityDataItem("Jaldee theek ho jaiyee.","Get well soon."));
//
//       addItem(new CityDataItem("Mudde par aaiye.","Come to the point."));
//
//       addItem(new CityDataItem("Apne vade se mat mukro.","Do not back out of your promise."));
//
//       addItem(new CityDataItem("Farsh par yaha vaha mat thuko.","Don’t spit on the floor here and there."));
//
//       addItem(new CityDataItem("Khoob muskurao.","Smile a lot."));
//
//       addItem(new CityDataItem("aldi office pahucho kyunki boss naraaz hai.","Reach office early as boss is angry."));
//
//       addItem(new CityDataItem("Zyada mat khao.","Do not overeat."));
//
//       addItem(new CityDataItem("Apne joote nikaal lo.","Take off your shoes."));
//
//       addItem(new CityDataItem("Faltu baat mat karo.","Do not talk nonsense."));
//
//       addItem(new CityDataItem("Table laga lo.","Lay the table."));
//
//       addItem(new CityDataItem("Ek nal tha.","There was a tap."));
//
//       addItem(new CityDataItem("Kya tumhara bhai wahaan tha?","Was your brother there?"));
//
//       addItem(new CityDataItem("Koi hai kya?","Is someone there?"));
//
//       addItem(new CityDataItem("Kya aapke dil mein pyaar nahi hai?","Isn’t there love in your heart?"));
//
//       addItem(new CityDataItem("Tum wahaan kyon chipe hue ho?","Why are you hidden there?"));
//
//       addItem(new CityDataItem("ungle mein ek raja rehta tha.","There lived a king in Jungle."));
//
//       addItem(new CityDataItem("Wahaan kuch nahi tha.","Nothing was there."));
//
//       addItem(new CityDataItem("Ek raja wahaan gaya.","There went a king."));
//
//       addItem(new CityDataItem("Wahaan kya hai?","What is there?"));
//
//       addItem(new CityDataItem("Us shahar mein ek park tha.","There was a park in that city."));
//
//       addItem(new CityDataItem("Kya tumhare pass paise nahi hai?","Do you not have money?"));
//
//       addItem(new CityDataItem("Class mein 3 ladkiyaan baithee thee.","There were 3 girls sitting in the class."));
//
//       addItem(new CityDataItem("Mere papa wahaan rehte the.","There lived my dad."));
//
//       addItem(new CityDataItem("Table par pen tha.","There was a pen on the table."));
//
//       addItem(new CityDataItem("Takiye ke neeche ek patr hai.","There is a letter beneath/underneath the pillow."));
//
//       addItem(new CityDataItem("Vahan koi nahihoga.","There will be no one."));
//
//       addItem(new CityDataItem("Tumhare bhai ke saath ek aadmee khada hai.","There is a man standing with your brother."));
//
//       addItem(new CityDataItem("Is tarah ke kai phool hai.","There are so many such flowers."));
//
//       addItem(new CityDataItem("Vahan dekhne ko kuch nahi hai.","There is nothing to see."));
//
//       addItem(new CityDataItem("(Kya class mein koi nahi hai?","Isn’t there anyone in class?"));
//
//       addItem(new CityDataItem("Khelne ke liye ladke nahi hai.","There are no boys to play."));
//
//       addItem(new CityDataItem("Uske batue mein paise nahi hai.","There is no money in his wallet."));
//
//       addItem(new CityDataItem("Is company mein aage badhne ke avsar hain.","There’re opportunities in this company to grow."));
//
//       addItem(new CityDataItem("Jaane ki zaroorat nahi hai.","There is no need to go."));
//
//       addItem(new CityDataItem("Burger khane ki koi jaroorat nahi.","There is no need to eat burger."));
//
//       addItem(new CityDataItem("Ek saanp tha","Sindh"));
//
//       addItem(new CityDataItem("Ek ped hai, jiska rang laal hai.","There is a tree of red colour."));
//
//       addItem(new CityDataItem("Kya tumhare pass pen hai?","Do you have a pen?"));
//
//       addItem(new CityDataItem("Us kuye mein pani nahi tha.","There was no water in that well."));
//
//       addItem(new CityDataItem("Jab kbhi mai pareshan tha, tum mere sath the.","Whenever I was in trouble, you’re there with me."));
//
//       addItem(new CityDataItem("Maine jo kuch kiya, vahi par kiya.","Whatever I did, I did there."));
//
//       addItem(new CityDataItem("Uski zindagi mein khushi nahi hai.","There is no joy in his life."));
//
//       addItem(new CityDataItem("Kya vahan kuch chal raha hai?","Is something going on there?"));
//
//       addItem(new CityDataItem("Pyaar jaisi koi cheez nahi hoti.","There is no such thing as love."));
//
//       addItem(new CityDataItem("Aisa koi shabd nahi hota.","There is no such word."));
//
//       addItem(new CityDataItem("Aisi koi kahani nahi hai.","There is no such story."));
//
//       addItem(new CityDataItem("Aisa koi gaanv nahi hai.","There is no such village."));
//
//       addItem(new CityDataItem("Aisa koi desh nahi hai, jahan sirf janvar rahte ho.","There’s no such a country, where there’re only animals."));
//
//       addItem(new CityDataItem("Aisa koi mobile nahi h, jise mai thik nahi kr sakta.","There is no such a mobile, which I can’t repair."));
//
//       addItem(new CityDataItem("Kya vahan koi nahi hai?","Isn’t there anyone?"));
//
//       addItem(new CityDataItem("Aisa koi aadmee nahi hota jise chot nahi lagti.","There is no such a man, who doesn’t get hurt."));
//
//       addItem(new CityDataItem("Wahaan kitne log hai?","How many people are there?"));
//
//       addItem(new CityDataItem("Wahaan kitne log the?","How many people were there?"));
//
//       addItem(new CityDataItem("Wahaan kya hai?","What is there?"));
//
//       addItem(new CityDataItem("Tum vahan kiske saath the?","With whom were you there?"));
//
//       addItem(new CityDataItem("Us gaon mein bijlee nahi hai.","There is no electricity in that village."));
//
//       addItem(new CityDataItem("Kaan kholkar sun lo.","You better listen up."));
//
//       addItem(new CityDataItem("Bahut saha, bas ab nahi!","Suffered a lot, but not anymore!"));
//
//       addItem(new CityDataItem("Mujhe paune saat baje uthna hai.","I am to get up at quarter to seven."));
//
//       addItem(new CityDataItem("Ham bahut shighr aa gaye hain.","We are too early."));
//
//       addItem(new CityDataItem("Tumhen apne kam mein vyast rahana chahiye.","You must be busy in your work."));
//
//       addItem(new CityDataItem("Hamen safalta ka pura bharosa hai.","We are sure of success."));
//
//       addItem(new CityDataItem("Thanda pani mat piyo.","Don’t take chilled water."));
//
//       addItem(new CityDataItem("Thandi cheeje mat khao.","Don’t take chilled eatables."));
//
//       addItem(new CityDataItem("Vah aath baje uthta hai.","He wakes up at 8 o’clock."));
//
//       addItem(new CityDataItem("Vah samay ka poora paaband hai.","He is quite punctual."));
//
//       addItem(new CityDataItem("Bijli bhi chamak rahi hai.","It is lightning."));
//
//       addItem(new CityDataItem("Aaj behad garmi hai.","It’s very hot today."));
//
//       addItem(new CityDataItem("Mujhe aapka patra mila par main padh nahi saka.","I got your letter but I couldn’t read."));
//
//       addItem(new CityDataItem("Jab aap aaye, vo nikal chuka tha.","When you came, he had left."));
//
//       addItem(new CityDataItem("Ice-cream mat khao.","Don’t take ice cream."));
//
//       addItem(new CityDataItem("Theek hone ke bad ice cream kha lena.","Take ice-cream after you get well."));
//
//       addItem(new CityDataItem("Meri ghadi band ho gai hai.","My watch is not functioning."));
//
//       addItem(new CityDataItem("Vah kaamp raha hai.","He is shivering."));
//
//       addItem(new CityDataItem("Main janta hun, ap mujhse naraaz ho.","I know you are not happy with me."));
//
//       addItem(new CityDataItem("Vah gitaar ka aadi ho gaya hai.","He has been addicted to guitar."));
//
//       addItem(new CityDataItem("Tumhe to khansi ho gayi hai.","You have got cough."));
//
//       addItem(new CityDataItem("Muh dhak kar khansi karo.","Cover your mouth when you cough."));
//
//       addItem(new CityDataItem("Sava teen baje hain.","It’s quarter past three."));
//
//       addItem(new CityDataItem("Apni adaten sudharo.","Mend your ways."));
//
//       addItem(new CityDataItem("Tum din raat unnati karo, yahi meri dua hai!","May God succeed you by leaps and bounds!"));
//
//       addItem(new CityDataItem("Yah patr budhavar tak pahunch jaana chaahie.","This letter must reach before Wednesday."));
//
//       addItem(new CityDataItem("Dikhao chot kahaan lagi hai?","Show me, where you’ve been hurt?"));
//
//       addItem(new CityDataItem("Is hafte iska teekakaran karvana hai.","His vaccination should be done in this week."));
//
//       addItem(new CityDataItem("Seedhe khade raho, jhuko nahin.","Stand upright, don’t bend."));
//
//       addItem(new CityDataItem("Main seekhne me apna samay bitaata hu.","I spend my time in learning."));
//
//       addItem(new CityDataItem("Use pyar ka matlab nahi pata.","He doesn’t know the meaning of love."));
//
//       addItem(new CityDataItem("Aaj budhar hai, vo ravivar ko aaega.","It’s Wednesday today, he’ll come on Sunday."));
//
//       addItem(new CityDataItem("(Jitni bhook ho utna hi khana.","Eat as per your appetite."));
//
//       addItem(new CityDataItem("Bed par khana mat girao.","Don’t spill the food on the bed."));
//
//       addItem(new CityDataItem("Main exercise ke lie samay nahin nikal pa raha hun.","I am not able to make time for exercise."));
//
//       addItem(new CityDataItem("Jitana ho sake saaf likho.","Write as legibly as you can."));
//
//       addItem(new CityDataItem("Ye mera saubhagya hai ki main tera dost hun.","It’s my pleasure to be your friend."));
//
//       addItem(new CityDataItem("Aapse baat karke bahut achchha laga.","It was pleasure talking to you."));
//
//       addItem(new CityDataItem("Zid mat karo.","Don’t be stubborn."));
//
//       addItem(new CityDataItem("Tum bhut ziddi ho gaye ho.","You have become very obstinate."));
//
//       addItem(new CityDataItem("Bhad mein jao.","Go to hell."));
//
//       addItem(new CityDataItem("Aavesh mein na aao.","Don’t get excited."));
//
//       addItem(new CityDataItem("Main kaam mein laga hua tha.","I was into some work."));
//
//       addItem(new CityDataItem("Tumhen uska zara bhi khyaal nahin aaya?","You didn’t even think about him?"));
//
//       addItem(new CityDataItem("Baalo mai tel laga lo.","Apply oil on your hair."));
//
//       addItem(new CityDataItem("Aaj aap kis ke sath soyenge?","With whom will you sleep today?"));
//
//       addItem(new CityDataItem("Main to mazaak kar raha tha.","I was just kidding."));
//
//       addItem(new CityDataItem("Maaf kijie, main samay par nahin aa saka.","I am sorry, I got late."));
//
//       addItem(new CityDataItem("Mujhe bahut baten karni hai.","I have a lot to talk about."));
//
//       addItem(new CityDataItem("Iske zimmedar tum ho.","You are responsible for this."));
//
//       addItem(new CityDataItem("Aapko huyi asuvidha ke liye hame khed h.","We regret for the inconvenience caused to you."));
//
//       addItem(new CityDataItem("Main tumse zarur milunga.","I’ll surely meet you."));
//
//       addItem(new CityDataItem("Atak atak ke mat bolo.","Don’t stutter."));
//
//       addItem(new CityDataItem("Jaldbaji mai tum bhool jate ho.","You always forget in haste."));
//
//       addItem(new CityDataItem("Sabse pahla mahina kaun sa hai?","Which is the first month?"));
//
//       addItem(new CityDataItem("(Ek maah mein kitne saptah hote hai?","How many weeks are there in a month?"));
//
//       addItem(new CityDataItem("Ham sabko angreji bhasha sikhani chahie.","We all must learn English language."));
//
//       addItem(new CityDataItem("Uski pratibha kabiletarifh hai.","His talent is praiseworthy."));
//
//       addItem(new CityDataItem("Vah hume chup chup kar dekh rahi hai.","She is sneaking out at us."));
//
//       addItem(new CityDataItem("Tumne mujhe aaj kese call kiya?","How did you call me up today?"));
//
//       addItem(new CityDataItem("Bharat gantantr kab bana?","When did India become Republic?"));
//
//       addItem(new CityDataItem("Aap kab paida huye?","When were you born?"));
//
//       addItem(new CityDataItem("Ab mujhe chalna chahie.","I must leave now."));
//
//       addItem(new CityDataItem("Jab tak tum mehnat nahi karoge, safal nahi ho paoge.","Unless you work hard, you’ll not be able to succeed."));
//
//       addItem(new CityDataItem("Kya aap usse meri baat kara denge?","Could you please make me talk to him?"));
//
//       addItem(new CityDataItem("Apki aawz kat rahi hai.","I’m sorry, you are breaking up."));
//
//       addItem(new CityDataItem("Kya aapne abhi ticket nahin liya hai","Haven’t you bought the ticket so far?"));
//
//       addItem(new CityDataItem("Sadak par marammat chal rahi hai.","The road is under repairing."));
//
//       addItem(new CityDataItem("Jab tab aap nahin aaoge, main intazar karunga.","Until you come, I’ll wait."));
//
//       addItem(new CityDataItem("Vo itna bimar h ki bistar se uth nahi sakta.","He is too weak to rise from the bed."));
//
//       addItem(new CityDataItem("Phone ko charging se utaar do.","Unplug the phone from charging."));
//
//       addItem(new CityDataItem("Tumne kisko cycle ke peeche bithaya hai?","Whom have you made sit at the back of your bicycle?"));
//
//       addItem(new CityDataItem("Yah bus kahaan jati hai?","Where does this bus go?"));
//
//       addItem(new CityDataItem("Abhi gadi aane me aadha ghanta baki hai.","It is still half an hour for the train to arrive."));
//
//       addItem(new CityDataItem("Jaise hi maine khelna shuru kiya, papa aa gaye.","The moment I started playing, dad turned up."));
//
//       addItem(new CityDataItem("Usne aisa kya kaha ki tumhen bura lag gaya?","What did he say to make you feel bad?"));
//
//       addItem(new CityDataItem("Ye paisa vasool movie thi.","This movie was worth watching."));
//
//       addItem(new CityDataItem("Train kis samay chootti hai?","When does the train leave?"));
//
//       addItem(new CityDataItem("Uski jaan mein jaan aayi.","He heaved a sigh of relief."));
//
//       addItem(new CityDataItem("Yah bachcha bada pyara lagta hai.","This child looks very lovely."));
//
//       addItem(new CityDataItem("Mera tumhen dukh pahunchane ka koi Irada nahi hai.","I don’t mean to hurt you."));
//
//       addItem(new CityDataItem("Ram ka tumhen dukh pahunchane ka koi Irada nahi hai.","Ram doesn’t mean to hurt you."));
//
//       addItem(new CityDataItem("Bahut si nadiyon mein badh aai hui hai.","Many a river is flooded."));
//
//       addItem(new CityDataItem("Usne mujhe saaf mana kar diya.","He gave me a flat refusal."));
//
//       addItem(new CityDataItem("Aap logon ke sahayog ke lie dhanyavad.","Thanks for your cooperation."));
//
//       addItem(new CityDataItem("Train do ghante deri se hai.","The train is late by two hours."));
//
//       addItem(new CityDataItem("Prateeksha grah mein chalte hain.","Let’s go to the waiting room."));
//
//       addItem(new CityDataItem("Tumne saara khel bigad diya","You spoiled the whole game."));
//
//       addItem(new CityDataItem("Aapne mere man ki baat kah di.","You spoke out my mind."));
//
//       addItem(new CityDataItem("Main unka ye sapna zarur pura karunga.","I’ll surely make his dream come true."));
//
//       addItem(new CityDataItem("Train aane hi wali hai.","The train is about/likely to arrive."));
//
//       addItem(new CityDataItem("Train par chado.","Get in the train."));
//
//       addItem(new CityDataItem("Sahi samay par prayas karo.","Strike the iron when it is hot."));
//
//       addItem(new CityDataItem("Aaj kal svarth ka jamana hai.","Selfishness is common these days."));
//
//       addItem(new CityDataItem("Main bazar gaya tha, raju mujhe mila tha","I met Raju in market."));
//
//       addItem(new CityDataItem("Mujhe apne aap par bharosa hai.","I believe in myself."));
//
//       addItem(new CityDataItem("Samaan ko bagal mein rakho.","Keep the luggage beside."));
//
//       addItem(new CityDataItem("Kuch khane ke liye lelo.","Get something to eat."));
//
//       addItem(new CityDataItem("Yah mere bas ki baat nahin.","It is beyond my capacity."));
//
//       addItem(new CityDataItem("Aapka yahan kaise aana hua?","What brings you here?"));
//
//       addItem(new CityDataItem("Mai tumhe maar dalunga,usne aisa kaha.","“I’ll kill you”, he said so."));
//
//       addItem(new CityDataItem("Tumne use jaane kyo diya?","Why did you let him go?"));
//
//       addItem(new CityDataItem("Train kab chalegi?","When will the train leave?"));
//
//       addItem(new CityDataItem("Tumne mujhe ek rupya kam diya hai.","You have given me a rupee less."));
//
//       addItem(new CityDataItem("Tum kuchh bhi kro, mujhe fark nahi padta.","You do anything, I don’t care."));
//
//       addItem(new CityDataItem("Koi fark nahi padta.","It doesn’t make any difference."));
//
//       addItem(new CityDataItem("Agla station Dehradun hai.","The next station is Dehradun."));
//
//       addItem(new CityDataItem("Apka station aa gya.","Here is your station."));
//
//       addItem(new CityDataItem("Dono ek dusre ke bahut kareebi hai.","Both are close to each other."));
//
//       addItem(new CityDataItem("Main agale mahine shimala jaunga.","I’ll go Shimla next month."));
//
//       addItem(new CityDataItem("Vah hmesha mere raaste me tang adata h.","He always stands in my ways."));
//
//       addItem(new CityDataItem("Train chalne mai kuch der hai","There is still some time in train’s departure."));
//
//       addItem(new CityDataItem("Mai is bakvaas ko sahan nahin kar sakta.","I can’t tolerate this nonsense."));
//
//       addItem(new CityDataItem("Hame kadi se kadi mehnat karni hai.","We have to work harder than the hardest."));
//
//       addItem(new CityDataItem("Aapke bhai ko kab se bukhar hai?","How long has your brother been down with fever?"));
//
//       addItem(new CityDataItem("Main use dhokha nahi de sakta.","I can’t cheat her."));
//
//       addItem(new CityDataItem("Usne mujhe dhokha diya.","He cheated on me."));
//
//       addItem(new CityDataItem("Kya mujhe kafi der intejaar karna padega?","Will I have to wait for a long?"));
//
//       addItem(new CityDataItem("Mujhe daant ke Doctor se milna hai.","I want to see a dentist."));
//
//       addItem(new CityDataItem("Usko bahut chot lagi hai.","He is badly hurt."));
//
//       addItem(new CityDataItem("Kal raat mujhe bukhar ho gaya tha.","I had a fever last night."));
//
//       addItem(new CityDataItem("Ham taxi kar lenge.","We will hire a taxi/cab"));
//
//       addItem(new CityDataItem("Mujhe gahre rang ka frem chahie.","I need a darker frame."));
//
//       addItem(new CityDataItem("Mere paise ek saal me khatm ho jaayenge","My money would run out in a year."));
//
//       addItem(new CityDataItem("Samay bahut jaldi beet jaata hai.","Time runs out very quickly."));
//
//       addItem(new CityDataItem("Uska ek aalishaan farm house hai.","He has a sumptuous farm house."));
//
//       addItem(new CityDataItem("Ye ek behtareen breakfast hai.","This is a sumptuous breakfast."));
//
//       addItem(new CityDataItem("Apne pariwar ka dhyan rakho.","Take care of your family."));
//
//       addItem(new CityDataItem("Niyamon ka paalan karo.","Abide by the rules."));
//
//       addItem(new CityDataItem("Aapne ye kitne achchhe se bataya!","How elegant you explained it!"));
//
//       addItem(new CityDataItem("Yahaan tambaaku ki kheti hoti hai","Tobacco is cultivated here."));
//
//       addItem(new CityDataItem("Kuch bhi aisa nahi hai jo khatm na ho.","Nothing is immortal."));
//
//       addItem(new CityDataItem("Vo ek dhokhebaaz vyakti hai.","He is a fraudulent person."));
//
//       addItem(new CityDataItem("Aapke kaam mein koi galati nahin hai.","There is no flaw in your work."));
//
//       addItem(new CityDataItem("Aap mujhe uske khilaf mat bhadkayiye.","Don’t provoke me against him."));
//
//       addItem(new CityDataItem("Uski aankho se aansoo tapak rahe the.","The tears were trickling from his eyes."));
//
//       addItem(new CityDataItem("Maine nal se paani tapakne ki aawaaz suni.","I heard the trickle of water from the tap."));
//
//       addItem(new CityDataItem("Tum uske pyar ko paise se nahi tol sakte.","You can’t assess his love for money."));
//
//       addItem(new CityDataItem("Ise aasani se khatm nahi kiya ja sakta.","It can’t be eradicated easily."));
//
//       addItem(new CityDataItem("Is mudde par aapka kya drishtikon hai?","What’s your approach in this matter? "));
//
//       addItem(new CityDataItem("Main khelne ka shaukeen hu.","I am fond of playing."));
//
//       addItem(new CityDataItem("Wo guitar bajaane ka shaukeen hai.","He is fond of playing guitar."));
//
//       addItem(new CityDataItem("Maine turant uska virodh kiya.","I retaliated immediately."));
//
//       addItem(new CityDataItem("Aapko ye tatthya logo se nahi chhipana chahiye.","You shouldn’t conceal this fact from public."));
//
//       addItem(new CityDataItem("Hum satya ko zyada der tak chhipa nahi sakte.","We can’t conceal the truth for a long."));
//
//       addItem(new CityDataItem("Uski baato ne mujhe himmat di.","His words strengthened me."));
//
//       addItem(new CityDataItem("Is shahar me English kaafi boli jaati hai.","English speaking is prevalent in this city."));
//
//
//       addItem(new CityDataItem("Yahaan cigarette peene wale kaafi hai.","Cigarette smoking is prevalent here."));
//
//       addItem(new CityDataItem("Vo kaafi samay se yahaan hai.","He has been here for a long."));
//
//       addItem(new CityDataItem("Is dawai ne mera dard kam kar diya.","This medicine lessened my pain."));
//
//       addItem(new CityDataItem("Usne mujhe dukhi kar diya.","He saddened me."));
//
//       addItem(new CityDataItem("Thodi der ke liye mere sath raho.","Stay with me for a while."));
//
//       addItem(new CityDataItem("Usne bas thodi der kaam kiya.","He worked just for a while. "));
//
//       addItem(new CityDataItem("Mujhe uske baare me kal hi pata chala.","I got to know about her yesterday itself."));
//
//       addItem(new CityDataItem("Apne bhaashan ko lamba mat kheencho.","Don’t elongate your speech."));
//
//       addItem(new CityDataItem("Vo kisi bhee baat ko lamba karke batata hai.","He elongates his talks."));
//
//       addItem(new CityDataItem("Vo mere peeche peeche fir raha hai.","He is running after me."));
//
//       addItem(new CityDataItem("Mujhe uske baare me kal hi pata chala.","I came to know about her yesterday itself."));
//
//       addItem(new CityDataItem("Maine contract nahi toda.","I didn’t breach the contract."));
//
//       addItem(new CityDataItem("Nirashavadi mat baniye. Aashavadi baniye.","Don’t be pessimistic. Be optimistic."));
//
//       addItem(new CityDataItem("Usne saari zameen apne adhikar me le li","He acquired the whole land."));
//
//       addItem(new CityDataItem("Main aap par apni ichchha nahi thop sakta.","I can’t impose my will on you."));
//
//       addItem(new CityDataItem("Usne match me bahut jabardast performance di.","He had an incredible performance in the match."));
//
//       addItem(new CityDataItem("Usne mujhe good bye kiya or chala gaya.","He bade me good bye and left."));
//
//       addItem(new CityDataItem("Maine ye insaniyat ke naate kiya hai","I have shown humanity."));
//
//       addItem(new CityDataItem("Main use bas apna ek zariya banauga","I will just use him for my sake."));
//
//       addItem(new CityDataItem("Ye sab usaki chal hai tumhe fasane ki","This is all his conspiracy to trap you."));
//
//       addItem(new CityDataItem("Is jhande ko yahan gadna hai","This flag is to be dug here."));
//
//       addItem(new CityDataItem("Apne pairon ko ghasito mat.","Don’t drag your feet."));
//
//       addItem(new CityDataItem("Ghutne ke bal mat chalo.","Don’t drag your knees."));
//
//       addItem(new CityDataItem("Kursi ko ghasito mat.","Don’t drag the chair."));
//
//       addItem(new CityDataItem("Pen ko ghasito mat.","Don’t drag the pen."));
//
//       addItem(new CityDataItem("Apne nakhoon mat chabao.","Don’t bite your nails."));
//
//       addItem(new CityDataItem("Apni ungali munh mein mat dalo.","Don’t put your finger into your mouth."));
//
//       addItem(new CityDataItem("Apne kapade badal lo.","Change your clothes."));
//
//       addItem(new CityDataItem("Apna homework Complete karo.","Complete your homework."));
//
//       addItem(new CityDataItem("Apni notebook ke pages ko mat phaado.","Don’t tear the pages of your notebook."));
//
//       addItem(new CityDataItem("Halla mat karo.","Don’t make a noise."));
//
//       addItem(new CityDataItem("Jhagda mat karo.","Don’t make a quarrel."));
//
//       addItem(new CityDataItem("Sharmao mat.","Don’t be shy."));
//
//       addItem(new CityDataItem("Kya aap ek jagah par nahin baith sakte?","Can’t you sit still at one place?"));
//
//       addItem(new CityDataItem("Sthir khade raho. hilna mat.","Stand still. Don’t move."));
//
//       addItem(new CityDataItem("Mobile par khelna band karo.","Stop playing on mobile."));
//
//       addItem(new CityDataItem("Mobile par game khelna band karo.","Stop playing games on mobile."));
//
//       addItem(new CityDataItem("T.V. dekhna band karo.","Stop watching TV."));
//
//       addItem(new CityDataItem("Cartoon dekhna band karo.","Stop watching cartoon."));
//
//       addItem(new CityDataItem("Apne daant achchhe se saaph karo.","Brush your teeth properly."));
//
//       addItem(new CityDataItem("Apne kapade pahan lo","Wear your clothes."));
//
//       addItem(new CityDataItem("Apne joote pahan lo.","Put on your shoes.h"));
//
//       addItem(new CityDataItem("Apne kapade utaar do.","Take off your cloths."));
//
//       addItem(new CityDataItem("Apne joote utaar do.","Take off your shoes."));
//
//       addItem(new CityDataItem("Apne joote ke tasmein baandh lo.","Tie your shoe laces."));
//
//       addItem(new CityDataItem("Apna khana jaldi khatm karo.","Finish your food quickly."));
//
//       addItem(new CityDataItem("Ye aapki health ke lie achchha hai.","It is good for your health."));
//
//       addItem(new CityDataItem("Ise mat chhedo.","Don’t touch it."));
//
//       addItem(new CityDataItem("Mere mobile ko mat chhedo.","Don’t touch my mobile."));
//
//       addItem(new CityDataItem("T. V. ko mat chhedo.","Don’t touch the TV."));
//
//       addItem(new CityDataItem("Laptop ko mat chhedo.","Don’t touch the laptop."));
//
//       addItem(new CityDataItem("Apni kitabein apne bag mein rakh do.","Keep your books in your bag."));
//
//       addItem(new CityDataItem("Apne joote shoe rack mein rakh do.","Keep your shoes in the shoe rack."));
//
//       addItem(new CityDataItem("Rone ki himmat bhi mat karana.","Don’t dare to cry/ weep."));
//
//       addItem(new CityDataItem("Bilkul nahin!","Not at all!"));
//
//       addItem(new CityDataItem("Ek ghoont bhi nahin!","Not even a sip!"));
//
//       addItem(new CityDataItem("Ek tukada bhee nahin!","Not even a bite!"));
//
//       addItem(new CityDataItem("Jaldbaaji mat karo.","Don’t be hasty."));
//
//       addItem(new CityDataItem("Galat baat mat karo.","Don’t talk nonsense."));
//
//       addItem(new CityDataItem("Main maje kar raha hun.","I am having fun."));
//
//       addItem(new CityDataItem("Main bor ho raha hun.","I am feeling bored."));
//
//       addItem(new CityDataItem("Main khana kha raha hun.","I am eating/ taking/ having food."));
//
//       addItem(new CityDataItem("Main office ke lie nikal raha hun.","I am leaving for office."));
//
//       addItem(new CityDataItem("Main office mein nahin hun.","I am not in office"));
//
//       addItem(new CityDataItem("Hichkichao mat","Don’t hesitate."));
//
//       addItem(new CityDataItem("Mujhe sach batao.","Tell me the truth."));
//
//       addItem(new CityDataItem("Glass ko ulta kar do.","Turn the glass upside down"));
//
//       addItem(new CityDataItem("(Nal khol do.","Turned on the tap."));
//
//       addItem(new CityDataItem("Computer band kar do.","Turned off the computer."));
//
//       addItem(new CityDataItem("Dil pe mat lo","Don’t take it to heart."));
//
//       addItem(new CityDataItem("Wo raste mein hai.","He is on the way."));
//
//       addItem(new CityDataItem("Wo prashansa ke laayak hai.","He is praiseworthy."));
//
//       addItem(new CityDataItem("Wo ekadh din mein aayega.","He will come in a day or so."));
//
//       addItem(new CityDataItem("Main ekaadh ghante me tumse miloonga.","I will meet in an hour or so."));
//
//       addItem(new CityDataItem("Mission poora hua.","Mission accomplished."));
//
//       addItem(new CityDataItem("Bilkul chinta mat karo.","Don’t worry at all."));
//
//       addItem(new CityDataItem("Aaj taptapaati garmi hai.","It’s blistering heat today."));
//
//       addItem(new CityDataItem("Tumhaare dil mein kuchh to hai","There is something in your heart."));
//
//       addItem(new CityDataItem("Aaj kanpkapaati thand hai.","It’s shivering cold today."));
//
//       addItem(new CityDataItem("Tez bolo.","Speak aloud."));
//
//       addItem(new CityDataItem("Mera intazaar karana.","Wait for me."));
//
//       addItem(new CityDataItem("Isake baare mein socho","Think about it."));
//
//       addItem(new CityDataItem("Aap kise pyaar karte ho?","Whom do you love?"));
//
//       addItem(new CityDataItem("Kitne ghammadi ho aap!","How arrogant you are!"));
//
//       addItem(new CityDataItem("Mujhe kal phon kariega.","Call me tomorrow."));
//
//       addItem(new CityDataItem("Samajh aaya?","understood?"));
//
//       addItem(new CityDataItem("Samajh aa gaya.","I got it"));
//
//       addItem(new CityDataItem("Mujhe aisa nahin lagata.","I don’t think so."));
//
//       addItem(new CityDataItem("Aaj kitni taarikh hai?","What is the date today?"));
//
//       addItem(new CityDataItem("Ye kiska hai?","Whose is this?"));
//
//       addItem(new CityDataItem("Bahut achchha!","Very nice!"));
//
//       addItem(new CityDataItem("Bahut bura!","Too bad!"));
//
//       addItem(new CityDataItem("Bahut achchha hona bhi achchha nahin hota.","It’s not good to be too good."));
//
//       addItem(new CityDataItem("Khud se pyaar karo.","Love yourself."));
//
//       addItem(new CityDataItem("Ye paap hai.","It’s a sin."));
//
//       addItem(new CityDataItem("Aap thake huwe lag rahe ho.","You are looking tired."));
//
//       addItem(new CityDataItem("Samay kisi ka intazaar nahin karta.","Time waits for none."));
//
//       addItem(new CityDataItem("Kya aapko ye chaahie.","Do you need it?"));
//
//       addItem(new CityDataItem("Kya aapko kuchh chaahie?","Do you need something?"));
//
//       addItem(new CityDataItem("Usi tarah ka kuchh.","Something of that sort."));
//
//       addItem(new CityDataItem("Kuchh na kuchh.","Something or the other."));
//
//       addItem(new CityDataItem("Kaheen na kaheen kuchh to galat hai.","Something is wrong somewhere."));
//
//       addItem(new CityDataItem("Use meree jarurat pad sakatee hai.","He may/might/could need me."));
//
//       addItem(new CityDataItem("Kuchh bhi vyaktigat nahin hai.","Nothing is personal."));
//
//       addItem(new CityDataItem("Ye keval ek soch hai.","This is just a mindset / thinking."));
//
//       addItem(new CityDataItem("Mujhe 8 baje yaad dila dena.","Remind me at 8. "));
//
//       addItem(new CityDataItem("Aap Apne umr se kam dikhate ho.","You look younger than your age."));
//
//       addItem(new CityDataItem("Kya chal raha hai?","What’s going on?"));
//
//       addItem(new CityDataItem("Kuchh khaas nahin.","Nothing special!"));
//
//       addItem(new CityDataItem("Hamesha ki tarah.","As usual!"));
//
//       addItem(new CityDataItem("Khaali mat baitho.","Don’t sit idle."));
//
//       addItem(new CityDataItem("Kuchh badhiya.","Something worthy!"));
//
//       addItem(new CityDataItem("Kuchh bhi jo tumhen achchha lage.","Anything, you feel like."));
//
//       addItem(new CityDataItem("Main job dhundh raha hun.","I am searching a job."));
//
//       addItem(new CityDataItem("Pata hai….","You know what…"));
//
//       addItem(new CityDataItem("Ye mat karo.","Don’t do it."));
//
//       addItem(new CityDataItem("Kya tum padhai kar rahe ho?","Are you studying?"));
//
//       addItem(new CityDataItem("Kya haal hai","How are you? "));
//
//       addItem(new CityDataItem("Pagal ho kya?","Are you mad or what?"));
//
//       addItem(new CityDataItem("Aapka din shubh ho!","Have a nice day!"));
//
//       addItem(new CityDataItem("Aapki yaatra mangalmay ho.","Have a nice journey."));
//
//       addItem(new CityDataItem("Doosra le lo.","Have another one."));
//
//       addItem(new CityDataItem("Dhairya rakho.","Have patience."));
//
//       addItem(new CityDataItem("Masti karo.","Have fun."));
//
//       addItem(new CityDataItem("Mujhe jaane do.","Let me go."));
//
//       addItem(new CityDataItem("Isse koi phark nahin padata.","It doesn’t matter."));
//
//       addItem(new CityDataItem("Aapka matlab kya hai?","What do you mean?"));
//
//       addItem(new CityDataItem("Kitne matlabi ho aap!","How selfish you are!"));
//
//       addItem(new CityDataItem("Kitna bakavas hai!","How ridiculous!"));
//
//       addItem(new CityDataItem("Mujhe iski aadat hai.","I am used to it."));
//
//       addItem(new CityDataItem("Zaahir si baat hai.","It’s obvious."));
//
//       addItem(new CityDataItem("Kya ham dhongi hain?","Are we hypocrite?"));
//
//       addItem(new CityDataItem("Ye phayade ka sauda nahin hai.","It’s not worthwhile."));
//
//       addItem(new CityDataItem("Kisi ka dil mat dukhao.","Don’t hurt anyone."));
//
//       addItem(new CityDataItem("Dost Banane se pahle kayi bar socho.","Think many a time before making friends."));
//
//       addItem(new CityDataItem("Hamesha vinamra raho.","Always be polite."));
//
//       addItem(new CityDataItem("Dayaloo bano.","Be generous."));
//
//       addItem(new CityDataItem("(Aapne mujhe hairan kar diya.","You amazed me."));
//
//       addItem(new CityDataItem("Khana bahut svadisht tha.","The Food was delicious."));
//
//       addItem(new CityDataItem("Khud par vishvaas karo.","Believe in yourself."));
//
//       addItem(new CityDataItem("Jo hota hai, achchhe ke lie hota hai.","All happen for good."));
//
//       addItem(new CityDataItem("ab aapaki bari hai.","It’s your turn now."));
//
//       addItem(new CityDataItem("sach mein!","Really!"));
//
//       addItem(new CityDataItem("kya hua tumhen?","What happened to you?"));
//
//       addItem(new CityDataItem("ye lijiye.","Here it is."));
//
//       addItem(new CityDataItem("aapka svagat hai","You are welcome."));
//
//       addItem(new CityDataItem("aap jhuth bol rahe ho","You are lying."));
//
//       addItem(new CityDataItem("aisa phir kabhi mat karna","Don’t ever do it again."));
//
//       addItem(new CityDataItem("kya aap shyor ho?","Are you sure?"));
//
//       addItem(new CityDataItem("bilakul nahin","Not at all."));
//
//       addItem(new CityDataItem("kitana bakvas hai!","How disgusting!"));
//
//       addItem(new CityDataItem("maine nahin kaha.","I didn’t say."));
//
//       addItem(new CityDataItem("main use phone kyon karunga.","Why would I call him/her?"));
//
//       addItem(new CityDataItem("kya aap Delhi mein rahe ho?","Have you lived in Delhi?"));
//
//       addItem(new CityDataItem("kya aap Delhi gaye ho?","Have you gone to Delhi?"));
//
//       addItem(new CityDataItem("kya karun main?","What do I do?"));
//
//       addItem(new CityDataItem("aisa sochana bhi mat.","Don’t even think so."));
//
//       addItem(new CityDataItem("bhool jao.","Forget it."));
//
//       addItem(new CityDataItem("Mujh Par Bharosa Rakho.","Trust me."));
//
//       addItem(new CityDataItem("mujhe vishvas nahi ho raha.","I can’t believe it."));
//
//       addItem(new CityDataItem("thodi der mein phone karie.","Call me a bit later."));
//
//       addItem(new CityDataItem("ye sab uski chaal hai tumhen fansane ki.","This is all his conspiracy to trap you."));
//
//       addItem(new CityDataItem("maine kisi ka kya bigada hai?","What wrong have I done to anyone?"));
//
//       addItem(new CityDataItem("paani gunguna ho gaya hai.","The water has turned lukewarm."));
//
//       addItem(new CityDataItem("aisa mere saath hi kyon hota hai?","Why does it happen only with me?"));
//
//       addItem(new CityDataItem("Kal raat boonda baandi hui.","It drizzled last night."));
//
//       addItem(new CityDataItem("Samay ke sath chalna bada mushkil hai.","It is difficult to match pace with the time."));
//
//       addItem(new CityDataItem("Aap kab aaye?","When did you come?  "));
//
//       addItem(new CityDataItem("Main angreji bol sakta hun.","I can speak English."));
//
//       addItem(new CityDataItem("Pitaji ke paas ek sundar pen hai.","Dad has a beautiful pen."));
//
//       addItem(new CityDataItem("Pustak mej par hai.","The book is on the table."));
//
//       addItem(new CityDataItem("Aapke papa ka kya naam hai?","What is your father’s name?"));
//
//       addItem(new CityDataItem("Kya time hua hai?","What time is it?"));
//
//       addItem(new CityDataItem("Kya hua?","What happened?"));
//
//       addItem(new CityDataItem("Wahan kya kya hua?","What all happened there?"));
//
//       addItem(new CityDataItem("Uske sath kya kya hua?","What all happened with him?"));
//
//       addItem(new CityDataItem("Uske paas kya hai?","What does he have? "));
//
//       addItem(new CityDataItem("Uske paas kya kya hai?","What all does he have?"));
//
//       addItem(new CityDataItem("Aapke paas kya hai?","What do you have?"));
//
//       addItem(new CityDataItem("Aapke paas kya nahi hai?","What do you not have?"));
//
//       addItem(new CityDataItem("Aapne kya kharida?","What did you buy?"));
//
//       addItem(new CityDataItem("Kya chal raha hai?","What is going on? "));
//
//       addItem(new CityDataItem("Mujhe nahi pata kya hai ye.","I don’t know what it is."));
//
//       addItem(new CityDataItem("Aap kya karne ki koshish kar rahe ho?","What are you trying to do?"));
//
//       addItem(new CityDataItem("Akhiri ravivar ko kya kiya aapne?","What did you do last Sunday?"));
//
//       addItem(new CityDataItem("Akhiri ravivar ko kya kya kiya apne?","What all did you do last Sunday?"));
//
//       addItem(new CityDataItem("Aapka matlab kya hai?","What do you mean?"));
//
//       addItem(new CityDataItem("Us ladke me tumhe kya pasand hai?","What do you like in that boy?"));
//
//       addItem(new CityDataItem("Mujhme tumhe kya pasand hai?","What do you like in me?"));
//
//       addItem(new CityDataItem("Kya insaan hain aap!","What a person you are!"));
//
//       addItem(new CityDataItem("Kya ladki hai vo!","What a girl she is!"));
//
//       addItem(new CityDataItem("Aap kya karte ho?","What do you do?"));
//
//       addItem(new CityDataItem("Agla topic kya tha?","What was the next topic?"));
//
//       addItem(new CityDataItem("Wo aaj kya perform kar rahe hain?","What are they performing today?"));
//
//       addItem(new CityDataItem("Apka pasandida khel kya hai?","What is your favorite sport?"));
//
//       addItem(new CityDataItem("Apki visheshta kya hai?","What’s your quality?"));
//
//       addItem(new CityDataItem("Mujhe dedo jo kuch bhi tumhare paas hai.","Give me whatever you have."));
//
//       addItem(new CityDataItem("Jo kuch mainene chaha, mujhe vo mila.","Whatever I wanted, I got that."));
//
//       addItem(new CityDataItem("Jo kuch bhi tumne kaha, galat hai.","Whatever you said, is wrong."));
//
//       addItem(new CityDataItem("Jo kuch bhi aap choose karte ho, mera hai.","Whatever you choose, is mine."));
//
//       addItem(new CityDataItem("Aap kahaan ho?","Where are you?"));
//
//       addItem(new CityDataItem("Apko kaunsi book chaiye?","Which book do you want?"));
//
//       addItem(new CityDataItem("Kaun si jagahein aapko sabse zyada pasand hain","Which places do you like the most?"));
//
//       addItem(new CityDataItem("Tumhe dawai chahiye, par kaunsi?","You need a medicine, but which one?"));
//
//       addItem(new CityDataItem("Main ek kitab dhoond raha hu, jo ki laal colour ki hai.","I am looking for a book, which is in red colour."));
//
//       addItem(new CityDataItem("Android or windows phones me tumhe zyada pasand  kaunsa hai","Which one do you prefer, android phones or windows phones?"));
//
//       addItem(new CityDataItem("Shaadi ke liye aap kaunsa choose karogi?","Which one would you choose for wedding?"));
//
//       addItem(new CityDataItem("Kis college se ho aap?","Which college are you from?"));
//
//       addItem(new CityDataItem("Ye dibba khaali hai, jisme bahut saare phool the.","This box is empty, which had many flowers."));
//
//       addItem(new CityDataItem("Aap kaun ho?","Who are you?? "));
//
//       addItem(new CityDataItem("Kaun jaanta hai?","Who knows?"));
//
//       addItem(new CityDataItem("Kaun kaun jaante hai?","Who all know?"));
//
//       addItem(new CityDataItem("Kisne kahaan?","Who said?"));
//
//       addItem(new CityDataItem("Is tasveer ko kisne paint kiya?","Who painted this picture?"));
//
//       addItem(new CityDataItem("Wo ladki kaun hai?","Who is that girl?"));
//
//       addItem(new CityDataItem("Wo ladka kaun hai?","Who is that boy? "));
//
//       addItem(new CityDataItem("Is selfie me ye kaun hai?","Who is this in this selfie?"));
//
//       addItem(new CityDataItem("Guitar kaun baja raha hai?","Who is playing the guitar?"));
//
//       addItem(new CityDataItem("Apka favourite hero kaun hai?","Who is your favourite actor?"));
//
//       addItem(new CityDataItem("Apke favourite actors kaun kaun hai?","Who all are your favourite actors?"));
//
//       addItem(new CityDataItem("Mujhe nahi pata, cake kisne banaya?","I don’t know who made the cake."));
//
//       addItem(new CityDataItem("Sawaal ye hai, kaun is project ko karega?","The question is who will do this project?"));
//
//       addItem(new CityDataItem("Aaj raat kaun gaane waala hai?","Who is going to sing tonight?"));
//
//       addItem(new CityDataItem("India ka pahla pradhanmantri  kaun tha?","Who was the first prime minister of India?"));
//
//       addItem(new CityDataItem("Is tasveer ko kaun bana sakta hai?","Who can make this picture?"));
//
//       addItem(new CityDataItem("Apki rai kya hai, kaun match jitega?","What is your opinion, who will win the match?"));
//
//       addItem(new CityDataItem("IT department mein Rahul kaun hai?","Who is Rahul in IT department?"));
//
//       addItem(new CityDataItem("Agla superstar kaun hoga?","Who will be the next superstar?"));
//
//       addItem(new CityDataItem("Kisko ice-cream chahiye?","Who wants ice-cream?"));
//
//       addItem(new CityDataItem("Kaun khana pakayega?","Who will cook the food?"));
//
//       addItem(new CityDataItem("Ye Ram hai, jo mere sath tha.","This is Ram, who was there with me."));
//
//       addItem(new CityDataItem("Vo mera dost hai, jisne tumhe call kiya tha.","That is my friend, who had called you."));
//
//       addItem(new CityDataItem("(Jo koi bhi yaha hai, Rahul uske sath baat karna chahta hai.","Rahul wants to speak with whoever is here."));
//
//       addItem(new CityDataItem("Tumne Kyo pucha?","Why did you ask?"));
//
//       addItem(new CityDataItem("Tum kyo ro rahe ho?","Why are you crying?"));
//
//       addItem(new CityDataItem("Tum ander kyo nahi aate?","Why don’t you come in?"));
//
//       addItem(new CityDataItem("Usne job kyo chodi?","Why did he quit the job?"));
//
//       addItem(new CityDataItem("Tumne ye tennis table kyo kharidi?","Why did you buy this tennis table?"));
//
//       addItem(new CityDataItem("Tumne box open kyo kiya?","Why did you open the box?"));
//
//       addItem(new CityDataItem("Hum pizza order kyo na kare?","Why shall we not order pizza?"));
//
//       addItem(new CityDataItem("Tum gussa kyo ho?","Why are you angry?"));
//
//       addItem(new CityDataItem("Aaj tum itne thake hue kyo ho?","Why are you so tired today?"));
//
//       addItem(new CityDataItem("Tum actor kyo banna chahte ho?","Why do you want to become an actor?"));
//
//       addItem(new CityDataItem("Aaj subah tum late kyo the?","Why were you late this morning?"));
//
//       addItem(new CityDataItem("Kya main poonch sakti hu Kyo?","May I ask you why? "));
//
//       addItem(new CityDataItem("Tum wahan se kyo bhaage?","Why did you run from there? "));
//
//       addItem(new CityDataItem("Tum niraash kyo ho?","Why are you disappointed?"));
//
//       addItem(new CityDataItem("Usne iske baare mein use kyo nahi kahaan?","Why didn’t she tell him about it?"));
//
//       addItem(new CityDataItem("Ve us building ke aas paas kyo ghoom rahe hai?","Why are they walking around that building?"));
//
//       addItem(new CityDataItem("Wo sab achchhe se jaante hain, Riya kyo dukhi h","They all know very well why Riya is upset."));
//
//       addItem(new CityDataItem("Aaj tum itne late kyo ho?","Why are you so late today?"));
//
//       addItem(new CityDataItem("Ye pankha kaam kyo nahi kar raha?","Why is this fan not working?"));
//
//       addItem(new CityDataItem("Tum kab padhai karte ho?","When do you study?"));
//
//       addItem(new CityDataItem("Yeh kab shuru hota hai?","When does it start?"));
//
//       addItem(new CityDataItem("Tumne ye saari kab kharidi?","When did you buy this saree?"));
//
//       addItem(new CityDataItem("Tumhara birthday kab hai?","When is your birthday?"));
//
//       addItem(new CityDataItem("Tum wapas kab aa rahe ho?","When are you coming back?"));
//
//       addItem(new CityDataItem("Ravi baahar tha jab mene call kiya.","Ravi was out when I called."));
//
//       addItem(new CityDataItem("Tumari pariksha kab/kabse hai?","When is your exam?"));
//
//       addItem(new CityDataItem("Hum kab pahuchenge?","When will we arrive?"));
//
//       addItem(new CityDataItem("Tumne phone kab change kiya?","When did you change your phone?"));
//
//       addItem(new CityDataItem("Jab tumhare paas samay ho, mujhe message kar","Whenever you have time, message me."));
//
//       addItem(new CityDataItem("Jab me jawan tha, to acche se tair skta tha.","When I was a young, I could swim well."));
//
//       addItem(new CityDataItem("Jab mein ghar aaya, Shikha ro rahi thi.","When I came home, Shikha was crying."));
//
//       addItem(new CityDataItem("Jab wo 20 saal ki thi, uski shaadi ho gayi.","When she was 20, she got married."));
//
//       addItem(new CityDataItem("Me tumhe call karunga, jab hum jaayenge.","I’ll call you when we go."));
//
//       addItem(new CityDataItem("Kajal usse kab milegi?","When will Kajal meet him?"));
//
//       addItem(new CityDataItem("Tum kab soye?","When did you sleep?"));
//
//       addItem(new CityDataItem("Payal kahaan thi, jab uske parents aaye?","Where was Payal, when her parents turned up?"));
//
//       addItem(new CityDataItem("Sumit ke uncle ghar kab aayege?","When will Sumit’s uncle come home?"));
//
//       addItem(new CityDataItem("Jab kabhi main aaunga, hum movie dekhne chal","Whenever I come, we will go for a movie."));
//
//       addItem(new CityDataItem("Maine apne dil ki baat usse kahi, jab kabhi mujhe mauka mila.","I spoke my heart to her, whenever I got a chance"));
//
//       addItem(new CityDataItem("Aap kaise ho?","How are you? "));
//
//       addItem(new CityDataItem("Tumhara bhai kaisa hai.","How is your brother?"));
//
//       addItem(new CityDataItem("Tumhari chutiyaan kaise rahi?","How were your holidays?"));
//
//       addItem(new CityDataItem("Aaj ka show kaisa tha?","How was today’s show?"));
//
//       addItem(new CityDataItem("Tumhare papa kitne saal ke hai?","How old is your father?"));
//
//       addItem(new CityDataItem("Tumhari car kitni lambi hai?","How long is your car?"));
//
//       addItem(new CityDataItem("Wo kaise jata hai?","How does he go?"));
//
//       addItem(new CityDataItem("Mujhe nahi pata veg biryani kaise banani hai.","I don’t know how to cook veg biryani."));
//
//       addItem(new CityDataItem("Tumne is movie ko kitna enjoy kiya?","How much did you enjoy this movie?"));
//
//       addItem(new CityDataItem("Apke kitne bachche hai?","How many children do you have?"));
//
//       addItem(new CityDataItem("Uske kitne bachche hai?","How many children does he have?"));
//
//       addItem(new CityDataItem("Apke kitne bachche the?","How many children did you have?"));
//
//       addItem(new CityDataItem("Mere bete ko competitive exams ke liye kitna padhna chaiye?","How much should my son study for competitive exams?"));
//
//       addItem(new CityDataItem("Mobile per tum kitna time bitate ho?","How much time do you spend on mobile?"));
//
//       addItem(new CityDataItem("Tumne tabla bajana kaise sikha?","How did you learn to play Tabla?"));
//
//       addItem(new CityDataItem("Is machine ko kaise use karte hai?","How to use this machine?"));
//
//       addItem(new CityDataItem("Is puzzle ko kaise solve kare?","How to solve this puzzle?"));
//
//       addItem(new CityDataItem("Ek mahine mein tum kitni books padhte ho?","How many books do you read in a month?"));
//
//       addItem(new CityDataItem("Tum dance kaise karoge, jab tumare pair kam nahi kar rahe hai?","How will you dance, when your legs not working?"));
//
//       addItem(new CityDataItem("Aap wahaan aksar kab kab jaate ho?","How often do you go there?"));
//
//       addItem(new CityDataItem("Aap kab kab usse milte ho?","How often do you meet him?"));
//
//       addItem(new CityDataItem("Yahaan se bus stop kitna door hai?","How far is the bus stop from here?"));
//
//       addItem(new CityDataItem("Aap kitni door jaa sakte ho?","How far can you go?"));
//
//       addItem(new CityDataItem("Tum kise invite karne wale ho?","Whom are you going to invite?"));
//
//       addItem(new CityDataItem("Usne is post ke liye kise hire kiya?","Whom did he hire for this post?"));
//
//       addItem(new CityDataItem("Tumne mera beg kise diya?","Whom did you give my beg?"));
//
//       addItem(new CityDataItem("Tumne kisko dekha?","Whom did you see?"));
//
//       addItem(new CityDataItem("Tumne is sujhav ke liye kise phone kiya tha?","Whom had you called for this suggestion?"));
//
//       addItem(new CityDataItem("Aap kise invite karna chahoge?","Whom would you like to invite?"));
//
//       addItem(new CityDataItem("Vo kitni baar mujhse milega?","How many times will he meet me?"));
//
//       addItem(new CityDataItem("Hum kab kab school jayenge?","How often will we go to school?"));
//
//       addItem(new CityDataItem("Main jaanta hu, aap kahaan rahte ho.","I know where you live."));
//
//       addItem(new CityDataItem("Wahaan kya kya hua?","What all happened there?"));
//
//       addItem(new CityDataItem("Tum mujhe sone dete ho.","You let me sleep."));
//
//       addItem(new CityDataItem("Bachche mujhe padhne nahi dete","Children don’t let me study."));
//
//       addItem(new CityDataItem("Bachche padhne nahi dete.","Children don’t let study."));
//
//       addItem(new CityDataItem("Use jaane kyo nahi diya tumne?","Why did you not let him go?"));
//
//       addItem(new CityDataItem("Main use mere ghar aane doonga.","I will let him come my home."));
//
//       addItem(new CityDataItem("Main padhne nahi doonga.","I will not let study."));
//
//       addItem(new CityDataItem("Main tumhe padhne nahi doonga.","I will not let you study."));
//
//       addItem(new CityDataItem("Main kisi ko bhi padhne nahi doonga.","I will not let anyone study."));
//
//       addItem(new CityDataItem("Main har kisi ko padhne doonga.","I will let everyone study."));
//
//       addItem(new CityDataItem("Usne mujhe kuch nahi karne diya.","He didn’t let me do anything."));
//
//       addItem(new CityDataItem("Tumne mujhe khaane nahi diya.","You didn’t let me eat."));
//
//       addItem(new CityDataItem("Sarkaar ne hame building nahi banane di.","The government didn’t let us construct a building."));
//
//       addItem(new CityDataItem("Maa ne bachche ko pitne nahi diya.","Mom didn’t let the child beaten."));
//
//       addItem(new CityDataItem("Mummy mujhe TV dekhne deti hai.","Mom lets me watch the TV."));
//
//       addItem(new CityDataItem("Mummy mujhe TV nahi dekhne deti.","Mom doesn’t let me watch the TV."));
//
//       addItem(new CityDataItem("kya tum mujhe jaane doge agar main tumhe ₹10 doon to?","Will you let me go if I give you Rs 10?"));
//
//       addItem(new CityDataItem("Papa sochne nahi dete or phir daantte hai.","Dad doesn’t let think and then scolds."));
//
//       addItem(new CityDataItem("Main tumhe gane sunne doonga par pahle paise do.","I will let you listen to songs but first, you give me money."));
//
//       addItem(new CityDataItem("Vo hame ghar mein nahi ghusne dega.","He’ll not let us enter the house."));
//
//       addItem(new CityDataItem("Papa hame ped par nahi chadhne dete.","Dad doesn’t let us climb upon the tree."));
//
//       addItem(new CityDataItem("Bachche mummy papa ko sone nahi denge.","Children will not let mom and dad sleep."));
//
//       addItem(new CityDataItem("Main tumhein pen se likhne nahi de sakta.","I can’t let you write with a pen."));
//
//       addItem(new CityDataItem("Main tumhe aam todne doonga.","I’ll let you pluck the mangoes."));
//
//       addItem(new CityDataItem("Us ladke ne mujhe vaha khelne nahi diya.","That boy didn’t let me play there."));
//
//       addItem(new CityDataItem("Is aadmi ne ram ko yaha baithne nahi diya.","This man didn’t let Ram sit here."));
//
//       addItem(new CityDataItem("Main tumhe ye nahi karne doonga.","I will not let you do this."));
//
//       addItem(new CityDataItem("Vo aksar mujhe jane deta hai.","He often lets me go."));
//
//       addItem(new CityDataItem("Hum kabhi-kabhi use khelne dete the.","We used to let him play sometimes."));
//
//       addItem(new CityDataItem("Papa mujhe school jane nahi dete.","Dad doesn’t let me go to school."));
//
//       addItem(new CityDataItem("Mera akelapan mujhe jeene nahi dega.","My loneliness won’t let me live."));
//
//       addItem(new CityDataItem("Main tumhare dukh ko badhne nahi doonga.","I’ll not let your pain grow."));
//
//       addItem(new CityDataItem("Usne mujhe car nahi chalane di.","He didn’t let me drive the car."));
//
//       addItem(new CityDataItem("Usne mujhe bike nahi chalane di.","He didn’t let me ride the bike."));
//
//       addItem(new CityDataItem("Usne mujhe mobile nahi khareedne diya.","He didn’t let me purchase the mobile."));
//
//       addItem(new CityDataItem("Usne mujhe computer nahi chalane diya.","He didn’t let me operate the computer."));
//
//       addItem(new CityDataItem("Usne mujhe pani nahi peene diya.","He didn’t let me drink water."));
//
//       addItem(new CityDataItem("Usne mujhe khana nahi khane diya.","He didn’t let me eat the food."));
//
//       addItem(new CityDataItem("Kya tumne use baithne diya?","Did you let him sit?"));
//
//       addItem(new CityDataItem("Kya tum mujhe chein se jine de sakte ho?","Can you let me live peacefully?"));
//
//       addItem(new CityDataItem("Tum mujhe shayad na jane do.","You might not let me go."));
//
//       addItem(new CityDataItem("Vo pakka mujhe jane dega.","He must let me go."));
//
//       addItem(new CityDataItem("Bhagvaan aaj barish hone denge.","God will let it rain today."));
//
//       addItem(new CityDataItem("koi mujhe padhne nahi deta.","Nobody lets me study."));
//
//       addItem(new CityDataItem("Main tumhein bazaar jane de raha hoon.","I am letting you go to market."));
//
//       addItem(new CityDataItem("Hum sab use jeene nahi dete.","We all don’t let him live."));
//
//       addItem(new CityDataItem("Mujhe Burger kyo nahi khane dete tum?","Why don’t you let me eat Burger?"));
//
//       addItem(new CityDataItem("Vo mera dost hai isliye main use galat nahi karne deta.","He is my friend hence I don’t let him do wrong."));
//
//       addItem(new CityDataItem("Papa mujhe 18 saal se pehle car nahi chalane denge.","Dad will not let me drive the car before 18."));
//
//       addItem(new CityDataItem("Tum hamein jane do.","You let us go."));
//
//       addItem(new CityDataItem("Main tumhein jane kyo doon?","Why do I let you go?"));
//
//       addItem(new CityDataItem("Usne mujhe kabhi rone nahi diya.","He never let me cry."));
//
//       addItem(new CityDataItem("Tumne mujhe kabhi hansne nahi diya.","You never let me laugh."));
//
//       addItem(new CityDataItem("Tum na sote ho na mujhe sone dete ho.","Neither you sleep nor let me sleep."));
//
//       addItem(new CityDataItem("Ya to mujhe jane do ya phir tum jao.","Either let me go or you go yourself."));
//
//       addItem(new CityDataItem("Maine us din use phone nahi karne diya.","I didn’t let him call/phone that day."));
//
//       addItem(new CityDataItem("Maine bhi aane nahi diya.","Even I didn’t let come."));
//
//       addItem(new CityDataItem("Tumne mujhe sochne tak nahi diya.","You didn’t even let me think."));
//
//       addItem(new CityDataItem("Vo mujhe bhi sone nahi deta.","He doesn’t let me sleep either."));
//
//       addItem(new CityDataItem("Main na tumhein khelne doonga na TV dekhne doonga.","I’ll neither let you play nor watch TV."));
//
//       addItem(new CityDataItem("Hum tumhen ek second bhi sochne nahi denge.","We’ll not let you think even for a second."));
//
//       addItem(new CityDataItem("Main tumhein mithai khane doonga par tab jab tum mujhe bhi do.","I’ll let you eat sweets provided you give me too."));
//
//       addItem(new CityDataItem("Madam ne class mein sirph mujhe baithne diya.","Madam let only me sit in the class."));
//
//       addItem(new CityDataItem("Main tumhein exercise nahi karne doonga.","I’ll not let you do the exercise."));
//
//       addItem(new CityDataItem("Mummy aur papa hamein khelne denge.","Mom and dad will let us play."));
//
//       addItem(new CityDataItem("Kya aap mere bhai ko jane doge?","Will you let my brother go?"));
//
//       addItem(new CityDataItem("Rahul ne mujhe koi bhi kaam kabhi akele nahi karne diya.","Rahul never let me do any work alone."));
//
//       addItem(new CityDataItem("Vo hum bachchon ko mobile nahi chedne dete hai.","He doesn’t let we kids touch his mobile."));
//
//       addItem(new CityDataItem("Boss mujhe sochne tak nahi dete.","Boss doesn’t even let me think."));
//
//       addItem(new CityDataItem("Main sochne kyo doon?","Why do I let think?"));
//
//       addItem(new CityDataItem("Mummy mujhe padhne jaroor degi.","Mom must let me study."));
//
//       addItem(new CityDataItem("Vo mujhe padhne deta hai.","He lets me study."));
//
//       addItem(new CityDataItem("Yaha log mujhe chain se jeene nahi dete.","People here don’t let me live peacefully."));
//
//       addItem(new CityDataItem("Bachche padhne nahi dete.)","Children don’t let study."));
//
//       addItem(new CityDataItem("kya usne tumhein aane diya?","Did he let you come?"));
//
//       addItem(new CityDataItem("Hamein kyo nahi bolne diya tumne?","Why did you not let us speak?"));
//
//       addItem(new CityDataItem("Sarkaar hamein apni baat nahi kahne deti.","The government doesn’t let us speak our perspective."));
//
//       addItem(new CityDataItem("Main tumhein us bachche ko nahi peetne doonga.","I will not let you beat that child."));
//
//       addItem(new CityDataItem("Kya tum mujhe milne doge?","Will you let me meet?"));
//
//       addItem(new CityDataItem("log use mujhse milne nahi dete.","People don’t let him meet me."));
//
//       addItem(new CityDataItem("Mere papa mujhe aane nahi dete.","My father doesn’t let me come."));
//
//       addItem(new CityDataItem("5 Din lagenge.","It will take 5 days."));
//
//       addItem(new CityDataItem("6 saal lage.","It took 6 years."));
//
//       addItem(new CityDataItem("Aaj somvaar nahi hai.","It is not Monday today."));
//
//       addItem(new CityDataItem("Kal chhuttee thee.","It was holiday yesterday."));
//
//       addItem(new CityDataItem("Barish kab hogee?","When will it rain?"));
//
//       addItem(new CityDataItem("Kya barish hogee?","Will it rain?"));
//
//       addItem(new CityDataItem("Kya barish ho rahee hogee?","Will it be raining?"));
//
//       addItem(new CityDataItem("Aaj barish hogee.","It will rain today."));
//
//       addItem(new CityDataItem("Kal barish hui thee.","It had rained yesterday."));
//
//       addItem(new CityDataItem("Kal ole pade the.","It had hailed yesterday."));
//
//       addItem(new CityDataItem("Aaj ole padenge.","It will hail today."));
//
//       addItem(new CityDataItem("Parson ole padenge.","It will hail day after tomorrow."));
//
//       addItem(new CityDataItem("Parson ole pade the.","It had hailed day before yesterday."));
//
//       addItem(new CityDataItem("Parson chhuttee thee.","It was holiday day before yesterday."));
//
//       addItem(new CityDataItem("Parson chhuttee hogee.","It will be holiday day after tomorrow."));
//
//       addItem(new CityDataItem("2 minute lagte hai.","It takes 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lag rahe hai.","It is taking 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lage hai.","It has taken 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lage.","It took 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lag rahe the.","It was taking 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lage the.","It had taken 2 minutes."));
//
//       addItem(new CityDataItem("2 Minute lagenge.","It will take 2 minutes."));
//
//       addItem(new CityDataItem("Mujhe 2 Minute lagenge.","I will take 2 minutes"));
//
//       addItem(new CityDataItem("Ab Tumharee baree hai.","It is your turn now."));
//
//       addItem(new CityDataItem("Yah tumhara pyar hai.","Yah kya hai?"));
//
//       addItem(new CityDataItem("2 din ho gaye hai.","It has been 2 days."));
//
//       addItem(new CityDataItem("2 Din ho gaye the.","It had been 2 days."));
//
//       addItem(new CityDataItem("Mujhe 2 din ho gaye the.","It had been 2 days to me."));
//
//       addItem(new CityDataItem("Kya kal chhuttee thee?","Was it holiday yesterday?"));
//
//       addItem(new CityDataItem("Use kitna samay lagega?","How much time will he take?"));
//
//       addItem(new CityDataItem("Tumhe kitna samay lagta hai?","How much time do you take?"));
//
//       addItem(new CityDataItem("Aaj ole padane the.","It had to hail today."));
//
//       addItem(new CityDataItem("Aaj ole pad sakate hai.","It may hail today."));
//
//       addItem(new CityDataItem("Kya Dehradun mein barish huai?","Did it rain in Dehradun?"));
//
//       addItem(new CityDataItem("Barish kyo hotee hai?","Why does it rain?"));
//
//       addItem(new CityDataItem("Yah pyar hai.","It is love."));
//
//       addItem(new CityDataItem("Yah ek kursee hai.","It/This is a chair."));
//
//       addItem(new CityDataItem("Tum kitna samay loge?","How much time will you take?"));
//
//       addItem(new CityDataItem("Main das minat loonga.","I will take 10 minutes."));
//
//       addItem(new CityDataItem("Us din kya tha?","What was it on that day?"));
//
//       addItem(new CityDataItem("Andhera ho raha hai.","It is getting dark."));
//
//       addItem(new CityDataItem("Umas ho rahee hai.","It is getting humid."));
//
//       addItem(new CityDataItem("Yah meree khvahish hai.","It’s my will."));
//
//       addItem(new CityDataItem("Waha bahut barish hoti h.","It rains a lot there."));
//
//       addItem(new CityDataItem("Aaj barish ho saktee hai.","It can rain today."));
//
//       addItem(new CityDataItem("Aaj barish honi hai.","It has to rain today."));
//
//       addItem(new CityDataItem("Aaj barish honee thee.","It had to rain today."));
//
//       addItem(new CityDataItem("Ye tumhari soch hai.","It is your thinking."));
//
//       addItem(new CityDataItem("Ye kiska pen hai?","Whose pen is this/it?"));
//
//       addItem(new CityDataItem("Iskee keemat 5 Rupya hogee.","It will be for Rs 5"));
//
//       addItem(new CityDataItem("Kya aaj somvaar hai?","Is it Monday today?"));
//
//       addItem(new CityDataItem("Yaha barish ho rahee hai.","It is raining here."));
//
//       addItem(new CityDataItem("Vaha ole pad rahe the.","It was hailing there."));
//
//       addItem(new CityDataItem("kitna samay ho gaya hai?","How long has it been?"));
//
//       addItem(new CityDataItem("Kya kal barish hogee?","Will it rain tomorrow?"));
//
//       addItem(new CityDataItem("Mujhe do ghante lage.","It took me 2 hrs."));
//
//       addItem(new CityDataItem("Tumse mile hue mujhe 2 din ho gae the.","It had been 2 days to me having met you."));
//
//       addItem(new CityDataItem("Tumhen itna samay kyon lag raha hai?","Why are you taking this much time?"));
//
//       addItem(new CityDataItem("Mujhe ghar pahuchne me 5 hour lagte h.","It takes me 5 hours to reach home."));
//
//       addItem(new CityDataItem("Mujhe school pahuchne mein aadha ghanta lagta hai.","It takes me half an hour to reach school."));
//
//       addItem(new CityDataItem("Ram ko khana banane me samay lagta hai.","Ram takes time to prepare the food."));
//
//       addItem(new CityDataItem("Hamen computer seekhne mein 3 maheene lage.","We took 3 months to learn computer."));
//
//       addItem(new CityDataItem("Tumhe dhoodne me mujhe 5 min lage.","I took me 5 minutes to find/search you."));
//
//       addItem(new CityDataItem("Ye kaam karne me kaafi samay lagega.","It will take plenty of time to do this work."));
//
//       addItem(new CityDataItem("Aaj Tumhara din hai, kal mera hoga.","It’s your day today, it’ll be mine tomorrow."));
//
//       addItem(new CityDataItem("Tumhe dekhe hue mujhe 10 din ho gaye.","It has been 10 days to me having seen you."));
//
//       addItem(new CityDataItem("Office pahunchne mein kitna samay laga?","How much time did it take to reach office?"));
//
//       addItem(new CityDataItem("Office pahunchne mein tumhen kitna samay laga?","How much time did you take to reach office?"));
//
//       addItem(new CityDataItem("Kitaab khatam karne mein mujhe. 2 maheene lage.","It took me 2 months to finish the book."));
//
//       addItem(new CityDataItem("IAS adhikaree banne mein 3 saal lage.","I took 3 years to become an IAS officer."));
//
//       addItem(new CityDataItem("Ye kapda silne mein 20 din lagenge.","It will take 20 days to stitch this cloth."));
//
//       addItem(new CityDataItem("Agar tum pencil se likho, to kafi samay lagega.","If you write with a pencil, it will take too long."));
//
//       addItem(new CityDataItem("Ye khatm karne mein tum kitna samay loge?","How much time will you take to finish it?"));
//
//       addItem(new CityDataItem("Hamari shadi ki salgirah hai aaj.","It’s our marriage anniversary today."));
//
//       addItem(new CityDataItem("Tumhe dekhe hue mujhe kareeb 2 saal ho gaye hai.","It’s been about 2 years to me having seen you."));
//
//       addItem(new CityDataItem("Jab main vaha pahuncha, barish ho rahee thee.","When I reached there, it was raining."));
//
//       addItem(new CityDataItem("Khana khaye hue mujhe kai din ho gaye hai.","It has been many days to me having had the food."));
//
//       addItem(new CityDataItem("Achchhe kapde pahne hue kai din ho gaye hai.","It’s been many days having worn good clothes."));
//
//       addItem(new CityDataItem("Vaha gae hue mujhe kai din ho gaye hai.","It’s been many days to me having gone there."));
//
//       addItem(new CityDataItem("Khana khaye hue mujhe kai din ho gaye.","It has been many days to me having had the food."));
//
//       addItem(new CityDataItem("Aaj ole pad sakte the par nahi pade.","It may have hailed today but didn’t."));
//
//       addItem(new CityDataItem("Vo meree jindgee ka bahut aham din tha.","It was a very important day of my life."));
//
//       addItem(new CityDataItem("Use ghar pahunchne me kitna samay laga?","How much time did he take to reach home?"));
//
//       addItem(new CityDataItem("Match ka anand lete 2 ghante ho gae hai.","It has been 2 hrs enjoying the match."));
//
//       addItem(new CityDataItem("Us din poore desh mein chhuttee thee.","It was holiday that day in the whole country."));
//
//       addItem(new CityDataItem("Subah se barish ho rahee thee.","It had been raining since morning."));
//
//       addItem(new CityDataItem("Tumhe dekhe hue mujhe kareeb 2 saal ho gaye hai.","It’s been about 2 years to me having seen you."));
//
//       addItem(new CityDataItem("Jab main vaha pahuncha, barish ho rahee thee.","When I reached there, it was raining."));
//
//       addItem(new CityDataItem("Khana khaye hue mujhe kai din ho gaye hai.","It has been many days to me having had the food."));
//
//       addItem(new CityDataItem("Achchhe kapde pahne hue kai din ho gaye hai.","It’s been many days having worn good clothes."));
//
//       addItem(new CityDataItem("Vaha gae hue mujhe kai din ho gaye hai.","It’s been many days to me having gone there."));
//
//       addItem(new CityDataItem("Khana khaye hue mujhe kai din ho gaye.","It has been many days to me having had the food."));
//
//       addItem(new CityDataItem("Aaj ole pad sakte the par nahi pade.","It may have hailed today but didn’t."));
//
//       addItem(new CityDataItem("Vo meree jindgee ka bahut aham din tha.","It was a very important day of my life."));
//
//       addItem(new CityDataItem("Burger khaye hue mujhe 4 maheene ho gaye hai.","It’s been 4 months to me having eaten/had Burger."));
//
//       addItem(new CityDataItem("(Tumhen dekhe hue mujhe 3 din ho gaye hai.","It has been 3 days to me having seen you."));
//
//       addItem(new CityDataItem("Use ghar pahunchne me kitna samay laga?","How much time did he take to reach home?"));
//
//       addItem(new CityDataItem("Match ka anand lete 2 ghante ho gae hai.","It has been 2 hrs enjoying the match."));
//
//       addItem(new CityDataItem("Us din poore desh mein chhuttee thee.","It was holiday that day in the whole country."));
//
//       addItem(new CityDataItem("Subah se barish ho rahee thee.","It had been raining since morning."));
//
//       addItem(new CityDataItem("Tum mere danyee aur ho.","You are right to me."));
//
//       addItem(new CityDataItem("Kya Ram tumhare samne tha?","Was Ram in front of you?"));
//
//       addItem(new CityDataItem("Main uske aage khada tha.","I was standing ahead of him."));
//
//       addItem(new CityDataItem("Bachcho ke thik samne teacher khade hai.","The teacher is standing just in front of the students."));
//
//       addItem(new CityDataItem("Tumhare bayee or kaun hai?","Who is left to you?"));
//
//       addItem(new CityDataItem("Main tumhare peeche tha","I was behind you."));
//
//       addItem(new CityDataItem("Uske peeche kitne log khade hai?","How many people are standing behind him?"));
//
//       addItem(new CityDataItem("Mere bayee or koi ladka nahi tha.","There was no boy left to me."));
//
//       addItem(new CityDataItem("Rahul mere theek samne tha kya?","Was Rahul exactly in front of me?"));
//
//       addItem(new CityDataItem("Mere ghar ke saamne tumhara ghar hai.","Your house is in front of my house / mine."));
//
//       addItem(new CityDataItem("Mera ghar tumhare ghar se theek aage vala hai.","My house is just ahead of yours."));
//
//       addItem(new CityDataItem("Mera ghar tumhare ghar se theek peeche vala hai.","My house is just before yours."));
//
//       addItem(new CityDataItem("Rohit ke dayee or kitne log hai?","How many people are there right to Rohit?"));
//
//       addItem(new CityDataItem("Mere dayee or koi nahi hai.","There is no one to the right of me."));
//
//       addItem(new CityDataItem("Kya tumhare dayee or koi hai?","Is there someone to the right of you?"));
//
//       addItem(new CityDataItem("Kya tumhare bayee or koi nahi hai?","Is there no one to the left of you?"));
//
//       addItem(new CityDataItem("Kya tumhare aage koi hai?","Is there someone ahead of you?"));
//
//       addItem(new CityDataItem("Kya tumhare peeche koi nahi hai?","Is there no one behind you?"));
//
//       addItem(new CityDataItem("Kya tumhare samne koi hai?","Is there someone in front of you?"));
//
//       addItem(new CityDataItem("Kya tumhare bagal mein koi hai?","Is there someone next to you?"));
//
//       addItem(new CityDataItem("Hum bayee or khade the.","We were standing on the left."));
//
//       addItem(new CityDataItem("Hum dayee or khade the.","We were standing on the right."));
//
//       addItem(new CityDataItem("Delhi Bharat ke uttar mein hai.","Delhi is in north of India."));
//
//       addItem(new CityDataItem("Keral Bharat ke dakshin mein hai","Kerala is in south of India."));
//
//       addItem(new CityDataItem("Bangal Bharat ke poorab mein hai.","Bengal is in East of India."));
//
//       addItem(new CityDataItem("Uske samne kaun tha?","Who was there in front of him/her?"));
//
//       addItem(new CityDataItem("Mere aage line mein teen log khade the.","There were three people standing ahead of me in the queue."));
//
//       addItem(new CityDataItem("Ram ke aage 2 aadmi the.","There were 2 men ahead of Ram."));
//
//       addItem(new CityDataItem("Mere peeche line mein kitne the?","How many were there behind me in the queue?"));
//
//       addItem(new CityDataItem("Mere joote kamre ke ek kone mein pade the.","My shoes were lying in a corner of the room."));
//
//       addItem(new CityDataItem("Tumhare joote ke samne vale joote mere hai.","The shoes beside yours are mine."));
//
//       addItem(new CityDataItem("Vo tumhare kis taraf hai?","Which side is he to you?"));
//
//       addItem(new CityDataItem("Vo mere dayee or hai.","He is to the right of me."));
//
//       addItem(new CityDataItem("Dayee or to theek hai par vo kya bagal mein hai?","Right side is okay; but is he adjacent?"));
//
//       addItem(new CityDataItem("Hamare beech 2 ladkiyan hai.","There are 2 girls between us."));
//
//       addItem(new CityDataItem("Rohan ke bagal mein kaun hai?","Who is beside Rohan?"));
//
//       addItem(new CityDataItem("Tum dayee or the.","You were on the right."));
//
//       addItem(new CityDataItem("Tumhare peeche kaun hai? Koi nahi!","Who is behind you? None!"));
//
//       addItem(new CityDataItem("Main kis disha mein hoon?","Which direction am I in?"));
//
//       addItem(new CityDataItem("Tum is vakt uttar kee or ja rahe ho.","You are going towards north at the moment."));
//
//       addItem(new CityDataItem("Yah tasveer kiksi hai?","Whose is this painting?"));
//
//       addItem(new CityDataItem("Shor mat karo.","Don’t make a noise."));
//
//       addItem(new CityDataItem("Kya aap aam kha chuki hain?","Have you eaten the mango?"));
//
//       addItem(new CityDataItem("Aap Kahan Jaoge?","Where will you go?"));
//
//       addItem(new CityDataItem("Unke pass apne baig hai.","They have their bags."));
//
//       addItem(new CityDataItem("Kya yaha paas me dawa ki koi dukaan hai?","Is there a chemist nearby here?"));
//
//       addItem(new CityDataItem("Main Kahta hu, ruko.","I say, stop."));
//
//       addItem(new CityDataItem("Thik hai ab mujhe apna kam krne do","OK. Now you let me complete my work."));
//
//       addItem(new CityDataItem("Apna kamra saaf karo.","Clean your room please."));
//
//       addItem(new CityDataItem("Aaj chhutti ka din hai.","It is holiday today."));
//
//       addItem(new CityDataItem("Yah bahut dur hai.","It’s quite far."));
//
//       addItem(new CityDataItem("Iska matlab maine galti ki.","That means I made a mistake."));
//
//       addItem(new CityDataItem("Main car nahin chalaunga.","I will not drive the car."));
//
//       addItem(new CityDataItem("Vah pratidin school jati hai.","She goes to school everyday."));
//
//       addItem(new CityDataItem("Main market ja raha hu. Sath chaloge?","I’m going to Market. Will you come along?"));
//
//       addItem(new CityDataItem("Nahi. Abhi main Vyast hu.","No. I am busy at the moment."));
//
//       addItem(new CityDataItem("Ladke subah se nadi mein tair rahe hain.","Boys have been swimming in the river since morning."));
//
//       addItem(new CityDataItem("Vah angreji seekh raha hai.","He is learning English."));
//
//       addItem(new CityDataItem("Mere Pass Meri Car hai.","I have my car."));
//
//       addItem(new CityDataItem("Tumhare pass tumhara pen hai.","You have your pen."));
//
//       addItem(new CityDataItem("Tum kis kaksha mein padhate ho?","In which class do you study?"));
//
//       addItem(new CityDataItem("Mera bhai bhopal mein rahata hai.","My brother lives in Bhopal."));
//
//       addItem(new CityDataItem("Tumhare pass meri book hai.","You have my book."));
//
//       addItem(new CityDataItem("Mata ji khana bana rahi thi.","Mom was cooking food."));
//
//       addItem(new CityDataItem("Aapki umar kitani hai?","What is your age? "));
//
//       addItem(new CityDataItem("Kal me ek bas me yatra kar raha tha.","Yesterday I was travelling in a bus."));
//
//       addItem(new CityDataItem("Kya tumne aisi cheejo ka anubhav kiya?","Have you experienced such things?"));
//
//       addItem(new CityDataItem("Flight ka kiraya Train ke kiraye ke barabar hoga.","Flight fare will be equal to train fare."));
//
//       addItem(new CityDataItem("Iska Chehra balon se kyu Dhaka huwa hai?","Why is its face covered with hair?"));
//
//       addItem(new CityDataItem("Main chay pasand karata hun jabaki vah coffee pasand karati hai.","I prefer tea, whereas/while she prefers coffee."));
//
//       addItem(new CityDataItem("Kolkata Mumbai ki tulna me zyada bada hai","Kolkata is quite bigger than Mumbai."));
//
//       addItem(new CityDataItem("hindi","I was telling you about the painting."));
//
//       addItem(new CityDataItem("Achanak use ek chutkula yaad aya.","Suddenly, he remembered a joke."));
//
//       addItem(new CityDataItem("Kya main kal aapse mil sakta hun?","Could I meet you tomorrow?"));
//
//       addItem(new CityDataItem("Vah tumhari sahayta kar sakta tha.","He could have helped you."));
//
//       addItem(new CityDataItem("Vah cricket khel raha hai.","He is playing cricket."));
//
//       addItem(new CityDataItem("Vah kal indore ja rahi hai.","She is going to Indore tomorrow."));
//
//       addItem(new CityDataItem("Hamesha samajdari se Vyohar karo.","Always act wisely."));
//
//       addItem(new CityDataItem("Vah apne pitaji ki madad kar raha hai.","He is helping his father."));
//
//       addItem(new CityDataItem("Kya ham inam prapt kar rahe the?","Were we getting prizes?"));
//
//       addItem(new CityDataItem("aaj kon sa din hai?","What is the day today?"));
//
//       addItem(new CityDataItem("mere saath majaak kar rahe ho kya","Are you kidding me?"));
//
//       addItem(new CityDataItem("bahane mat banao.","Don’t make excuses."));
//
//       addItem(new CityDataItem("mujhe mat satao.","Don’t annoy me."));
//
//       addItem(new CityDataItem("mujhe gussa mat dilao.","Don’t make me angry."));
//
//       addItem(new CityDataItem("gussa mat ho.","Don’t be angry."));
//
//       addItem(new CityDataItem("mujhe pareshan mat karo.","Don’t bother me."));
//
//       addItem(new CityDataItem("mujhase bahas mat karo.","Don’t argue with me."));
//
//       addItem(new CityDataItem("Don’t argue with me.","english"));
//
//       addItem(new CityDataItem("apne haath achchhe se saaf kar lo.","Wash your hands properly."));
//
//       addItem(new CityDataItem("apna chehra achchhe se saaf kar lo.","Wash your face properly."));
//
//       addItem(new CityDataItem("kitab ko achchhe se pakdo.","Hold the book properly."));
//
//       addItem(new CityDataItem("chupachaap baithe raho, hilo mat.","Sit still. Don’t move."));
//
//       addItem(new CityDataItem("kya main nahin ja sakata?","Can I not go?"));
//
//       addItem(new CityDataItem("main kahan ja sakata hun?","Where can I go?"));
//
//       addItem(new CityDataItem("main kahan-kahan ja sakata hun?","Where all can I go?"));
//
//       addItem(new CityDataItem("aap kisake saath baith sakate ho?","With whom can you sit?"));
//
//       addItem(new CityDataItem("Wo America nahi ja paya.","He couldn’t go to America."));
//
//       addItem(new CityDataItem("Hamari teem kahan khel rahi hogi?","Where will our team be playing?"));
//
//       addItem(new CityDataItem("Vah agle ravivar Shalini se vivaah karega.","He will be marrying Shalini next Sunday."));
//
//       addItem(new CityDataItem("Zarurat me kaam ayaa dost hi sachha dost hai.","A friend in need is a friend indeed."));
//
//       addItem(new CityDataItem("Apne bachho ko apna kam karne do.","Let your children do their work themselves."));
//
//       addItem(new CityDataItem("Ayiye tumhara janam divas manaye.","Let’s celebrate your birthday."));
//
//       addItem(new CityDataItem("Hamne Apne bachchon ko bhagwan me viswas dilaya hai.","We have made our children believe in God."));
//
//       addItem(new CityDataItem("Maine ye pustaken use nahin di.","I didn’t give him these books."));
//
//       addItem(new CityDataItem("Usne mere patr ka uttar nahin diya.","He did not reply to my letter."));
//
//       addItem(new CityDataItem("Unhone taro ko bhi kat diya tha.","They had even cut off all the wires."));
//
//       addItem(new CityDataItem("6 Ghant e ke bad bad ve chale gaye.","They left after six hours."));
//
//       addItem(new CityDataItem("Kya usne nili shart pahni?","Did he wear a blue shirt?"));
//
//       addItem(new CityDataItem("Jail me kaidiyo se janwaro se badtar saluk kiya jaata hai.","In prison, captives are treated worst than animals."));
//
//       addItem(new CityDataItem("Kal main ek bas me yatra kar raha tha.","Yesterday I was travelling in a bus."));
//
//       addItem(new CityDataItem("Abhi tak koi nahin aaya hai.","Nobody has come yet."));
//
//       addItem(new CityDataItem("Uska beta sena mein bharti ho gaya hai?","His son has been selected in army?"));
//
//       addItem(new CityDataItem("Ham log unke prati hamdardi dikhana chahte hai","We people want to show pity on them."));
//
//       addItem(new CityDataItem("Uske jaane ke baad hamne khana khaya.","We had the food after he left."));
//
//       addItem(new CityDataItem("Usne kaha ki vah apna kaam kar raha tha.","She said that she had been doing his work."));
//
//       addItem(new CityDataItem("Tum subah se yahan kyon baithe huye ho?","Why have you been sitting here since morning?"));
//
//       addItem(new CityDataItem("Log aksar mujhe poochhte hai.","People often ask me."));
//
//       addItem(new CityDataItem("Aap kab-kab khelne jaate ho?","How often do you go to play?"));
//
//       addItem(new CityDataItem("Mai shayad hi kabhi wahan jata hu.","I seldom go there"));
//
//       addItem(new CityDataItem("Mai ghumne jata hu","I go for a walk"));
//
//       addItem(new CityDataItem("Aap kya karte ho?","What do you do?"));
//
//       addItem(new CityDataItem("Ye sunne mein accha lagta hai.","It sounds good."));
//
//       addItem(new CityDataItem("Aap kis kis ke saath khelte ho?","Who all do you play with?"));
//
//       addItem(new CityDataItem("Mai cricket khelta hu.","I play cricket."));
//
//       addItem(new CityDataItem("Mai cricket nahi khelta hu.","I don’t play cricket."));
//
//       addItem(new CityDataItem("Kya mai cricket khelta hu?","Do I play cricket?"));
//
//       addItem(new CityDataItem("Kya mai cricket nahi khelta hu?","Do I not play cricket?"));
//
//       addItem(new CityDataItem("Vah ghoomta hai.","He walks."));
//
//       addItem(new CityDataItem("Wo aksar ghoomta hai.","He often walks."));
//
//       addItem(new CityDataItem("Wo shayad hi kabhi ghoomta hai.","He seldom walks."));
//
//       addItem(new CityDataItem("Aap kya-kya khate ho?","What all do you eat?"));
//
//       addItem(new CityDataItem("Aap kab-kab khelne aate ho?","How often do you come to play?"));
//
//       addItem(new CityDataItem("Wo kise pyar karta hai?","Whom does he love?"));
//
//       addItem(new CityDataItem("Mai use ghar bhej deta hu.","I send him home."));
//
//       addItem(new CityDataItem("Wo kiski car chalati hai?","Whose car does she drive?"));
//
//       addItem(new CityDataItem("Aap kis-kis ke saath bat karte ho?","Who all do you speak with?"));
//
//       addItem(new CityDataItem("Kaun jata hai?","Who goes?"));
//
//       addItem(new CityDataItem("kaun- kaun jate hai?","Who all go?"));
//
//       addItem(new CityDataItem("Maine chaku se cake kata","I cut the cake with a knife."));
//
//       addItem(new CityDataItem("Usne neele pen se patr likha.","He wrote the letter with a blue pen."));
//
//       addItem(new CityDataItem("Usne patthar se chidiya mari.","He killed the bird with a stone."));
//
//       addItem(new CityDataItem("Hum aapke saath rahenge.","We will be/stay with you."));
//
//       addItem(new CityDataItem("Mere papa apne office laptop le ke gaye.","My dad brought laptop to his office."));
//
//       addItem(new CityDataItem("Tum imandari ke saath jeete ho.","You live with honesty."));
//
//       addItem(new CityDataItem("Main 2 baje paida hua tha.","I was born at 2 o’clock."));
//
//       addItem(new CityDataItem("Main ek hotel mein ruka.","I stayed at/in a hotel."));
//
//       addItem(new CityDataItem("Wo bus stop par khada tha.","He was standing at the bus stop."));
//
//       addItem(new CityDataItem("(Main dopahar mein wahan tha.","I was there in the afternoon."));
//
//       addItem(new CityDataItem("Hum raat mein padhte hain.","Hum raat mein padhte hain."));
//
//       addItem(new CityDataItem("Hum raat mein padhte hain.","We study at night.)"));
//
//       addItem(new CityDataItem("eh fruit 10 rs kilo bik raha hai.","This fruit is selling at Rs. 10 a kg"));
//
//       addItem(new CityDataItem("Main pyaaj 10 rs kilo khareed raha hun.","I am buying onion at Rs. 10 a kg."));
//
//       addItem(new CityDataItem("Main Holi par ghar aunga.","I will come home at Holi."));
//
//       addItem(new CityDataItem("Main Diwali par ghar aunga.","I will come home at Diwali."));
//
//       addItem(new CityDataItem("Wo uske janmdin par wahan jayega.","He will go there at his birthday."));
//
//       addItem(new CityDataItem("Ayansh ab 10 baje sota hai.","Ayansh sleeps at 10 now."));
//
//       addItem(new CityDataItem("Wah raat mein hospital gaya.","He went to hospital at night."));
//
//       addItem(new CityDataItem("Papa deepawali mein wahan jaenge.","Papa will go there at Diwali."));
//
//       addItem(new CityDataItem("Ham janamdin par aaye the.","We had come at birthday."));
//
//       addItem(new CityDataItem("Main glass se dekh sakta hun.","I can see through the glass."));
//
//       addItem(new CityDataItem("Mai is ched ke zariye andr dekh skta hu.","I can see inside through this hole."));
//
//       addItem(new CityDataItem("Main ek gali se gujar raha tha.","I was passing through a street."));
//
//       addItem(new CityDataItem("Ham bhumigat raste se gaye.","We went through the underpass."));
//
//       addItem(new CityDataItem("Paani is pipe se gujar raha hai.","Water is passing through this pipe."));
//
//       addItem(new CityDataItem("Main khidki se tumhe dekh sakti hun.","I can see you through the window."));
//
//       addItem(new CityDataItem("Usne mujhe is chhed se dekha.","He saw me through this hole."));
//
//       addItem(new CityDataItem("Hum surang se gaye.","We went through an underpass."));
//
//       addItem(new CityDataItem("Aman khidki se jhank raha hai.","Aman is peeping through the window."));
//
//       addItem(new CityDataItem("Paani is pipe se gujra.","Water passed through this pipe."));
//
//       addItem(new CityDataItem("Is pahaad ke us paar ek mandir hai.","There is a temple beyond this mountain."));
//
//       addItem(new CityDataItem("Us nadi ke paar kya hai?","What is there beyond that river?"));
//
//       addItem(new CityDataItem("Is Brahmand ke paar kuchh hai.","There is something beyond this universe."));
//
//       addItem(new CityDataItem("Soch se pare bhi chije hai.","There are things beyond imagination."));
//
//       addItem(new CityDataItem("Iske paar ek jungle tha.","There was a forest beyond it."));
//
//       addItem(new CityDataItem("Yeh train kanpur se hote hue Delhi jayegi.","This train will go to Delhi via Kanpur."));
//
//       addItem(new CityDataItem("Maine use apni photo bluetooth se bheji.","I sent him my picture via Bluetooth."));
//
//       addItem(new CityDataItem("Bas kotdwara se hote hue aati hai.","Bus comes via Kotdwara."));
//
//       addItem(new CityDataItem("Main Dubai ke raaste America gaya.","I went to America via Dubai."));
//
//       addItem(new CityDataItem("Use bluetooth se bhej do.","Send him via Bluetooth."));
//
//       addItem(new CityDataItem("Mera ghar tumhari dukan ke thik samne h.","My house is just opposite to your shop."));
//
//       addItem(new CityDataItem("Wo tumhare samne khada tha.","He was standing opposite you."));
//
//       addItem(new CityDataItem("Uski soch tumhari soch se thik ulti hai.","His thinking is opposite yours."));
//
//       addItem(new CityDataItem("Wo aapke kahe ka ulta karta hai.","He does opposite of what you say."));
//
//       addItem(new CityDataItem("Uski soch meri soch ke vipreet hai.","His thinking is opposite mine."));
//
//       addItem(new CityDataItem("Tum mere thik samne baithoge.","You will sit opposite to me."));
//
//       addItem(new CityDataItem("Wo pakka iska ulta hi karega.","He must do its opposite."));
//
//       addItem(new CityDataItem("Mera naam list me tumhre naam ke upar h","My name is above your name is the list."));
//
//       addItem(new CityDataItem("Paisa pyar se upar hai.","Money is above love."));
//
//       addItem(new CityDataItem("kewal uski ankhe pani ke upar thi.","Only his eyes were above water."));
//
//       addItem(new CityDataItem("Mera desh sabse pehle hai.","My country is above all."));
//
//       addItem(new CityDataItem("Bhukamp ki tivrata Richter scale mein 8 se upar hai.","The magnitude of the earthquake is above 8 in Richter scale."));
//
//       addItem(new CityDataItem("Mummy ji ped ke niche baithi hai.","Mom is sitting under the tree."));
//
//       addItem(new CityDataItem("Wo pul ke niche tha.","He was under the bridge."));
//
//       addItem(new CityDataItem("Mera ghar aapke ghar ke niche hai.","My house is underneath your house."));
//
//       addItem(new CityDataItem("Uski tasvir meri kitab ke niche hai.","Her photograph is beneath my book."));
//
//       addItem(new CityDataItem("Patr meri kitab ke niche hai.","The letter is underneath the book."));
//
//       addItem(new CityDataItem("Mobile takiye ke niche hai.","The mobile is beneath/underneath the pillow."));
//
//       addItem(new CityDataItem("Mera name list mein tumhare naam ke niche hai.","My name is below your name in the list."));
//
//       addItem(new CityDataItem("Uska muhh pani ke niche tha par naak upar.","His mouth was below water but nose was above."));
//
//       addItem(new CityDataItem("Mere dasvi mein 70 se niche hai.","I scored below 70% in 10th."));
//
//       addItem(new CityDataItem("Bhukamp ki tivrata Richter scale mein 9 se niche hai.","The magnitude of the earthquake is below 9 in Richter scale."));
//
//       addItem(new CityDataItem("Uska star tumse niche hai.","His level is below yours."));
//
//       addItem(new CityDataItem("Kimate niche ja rahi hai.","Prices are going down."));
//
//       addItem(new CityDataItem("Paani ka star niche ja raha hai.","Water level is going down."));
//
//       addItem(new CityDataItem("Gubbara niche ja raha hai.","Balloon is going down."));
//
//       addItem(new CityDataItem("Maine do kitabon ke beech mein phone rakha.","I kept the phone between two books."));
//
//       addItem(new CityDataItem("Main 50 logon ke beech mein tha.","I was among 50 people."));
//
//       addItem(new CityDataItem("Uski tasvir teen aur chijo ke beech rakhi hui thi","Her photograph was kept among 3 other items."));
//
//       addItem(new CityDataItem("Aman 4 logo ke beech hai.)","Aman is among 4 people."));
//
//       addItem(new CityDataItem("Main bheed ke beech tha.","I was amongst the crowd."));
//
//       addItem(new CityDataItem("Mere papa kai logo ke beech the.","My dad was amongst many people."));
//
//       addItem(new CityDataItem("Main ghar se bahar nikal raha hun.","I am getting out of my home."));
//
//       addItem(new CityDataItem("Wah Delhi se bahar ja chuka hai.","He has gone out of Delhi."));
//
//       addItem(new CityDataItem("Rahul ne 100 me se 90 no. praapt kiye","Rahul scored 90 out of 100."));
//
//       addItem(new CityDataItem("15 mein se keval 2 hi vidharthi hain.","There are only 2 students out of 15."));
//
//       addItem(new CityDataItem("Yahan se bahar niklo.","Get out of here!"));
//
//       addItem(new CityDataItem("Wahan 8 mein se keval 1 hi vidharthi hai","There is only 1 student out of 8."));
//
//       addItem(new CityDataItem("10 mein se 3 ke pas mobile the.","3 out of 10 had mobiles."));
//
//       addItem(new CityDataItem("Pen table par rakha hua hai.","The pen is kept on the table."));
//
//       addItem(new CityDataItem("Rohit hathi ke upar baitha hua hai.","Rohit is sitting on the elephant."));
//
//       addItem(new CityDataItem("Main Sunday ko gaya.","I went on Sunday."));
//
//       addItem(new CityDataItem("Vah 20 December 2012 ko aaya.","He came on 20th December 2012."));
//
//       addItem(new CityDataItem("Kitab laptop par rakhi hai.","The book is kept on the laptop."));
//
//       addItem(new CityDataItem("Hamlog somvaar ko aayenge.","We all will come on Monday."));
//
//       addItem(new CityDataItem("Main kood kar ghode par baith gaya.","I jumped upon the horse."));
//
//       addItem(new CityDataItem("Jhadu apne aap table par aa gaya.","The broom came upon the table by itself."));
//
//       addItem(new CityDataItem("Wo terrace se haathi ke upar kudega.","He’ll jump onto the Elephant from terrace."));
//
//       addItem(new CityDataItem("Main ghode ke upar kudaa.","I jumped upon the horse."));
//
//       addItem(new CityDataItem("Ram tumhare viruddh kyon hain?","Why is Ram against you?"));
//
//       addItem(new CityDataItem("Wo mere khilaaf use bhadka raha hai.","He is provoking him against me."));
//
//       addItem(new CityDataItem("Kya tum mere virodhi ho?","Are you against me?"));
//
//       addItem(new CityDataItem("Aman mere viruddh nahi ho sakta.","Aman can’t be against me."));
//
//       addItem(new CityDataItem("Wo mere bare mein baat kar raha hai.","He is talking about me."));
//
//       addItem(new CityDataItem("Papa mere bare mein jaante hai.","Papa knows about me."));
//
//       addItem(new CityDataItem("Uske bare mein baat mat karo.","Don’t talk about him."));
//
//       addItem(new CityDataItem("Wo Ram ka bhai hai.","He is Ram’s brother."));
//
//       addItem(new CityDataItem("Wo teen bhaiyo ki behan hai.","She is the sister of 3 brothers."));
//
//       addItem(new CityDataItem("Yeh kursi us dukan ki hai.","This chair is of that shop."));
//
//       addItem(new CityDataItem("Yashi hamare ghar aa rahi hai.","Yashi is coming to our home."));
//
//       addItem(new CityDataItem("Wo hospital ja raha hai.","He is going to hospital."));
//
//       addItem(new CityDataItem("Main school ki taraf ja raha hun.","I am going towards school."));
//
//       addItem(new CityDataItem("Wo tumhari taraf aa raha tha.","He was coming towards you."));
//
//       addItem(new CityDataItem("Wo hospital ki or ja raha hai.","He is going towards hospital."));
//
//       addItem(new CityDataItem("Main rassi ke upar se kuda.","I jumped over the rope."));
//
//       addItem(new CityDataItem("Hamare sir ke upar chhat hai.","There is a roof over our heads."));
//
//       addItem(new CityDataItem("Nadi ke upar ek pul hai.","There is a bridge over the river."));
//
//       addItem(new CityDataItem("Uska bhashan mere sir ke upar se gaya.","His lecture passed over my head."));
//
//       addItem(new CityDataItem("Main 5 minute mein aa jaunga.","I will come within 5 minutes."));
//
//       addItem(new CityDataItem("Wo 2 din mein hi wapas aa gaya hai.","He has come back within just 2 days."));
//
//       addItem(new CityDataItem("Wo 2 din ke andar aa raha hai.","He is coming within 2 days."));
//
//       addItem(new CityDataItem("Main tumse behtar hun.","I am better than you."));
//
//       addItem(new CityDataItem("Hum usse lambe hai.","We are taller than him."));
//
//       addItem(new CityDataItem("Maine zindagi bhar use pyaar kiya.","I loved him / her throughout my life."));
//
//       addItem(new CityDataItem("Humne raat bhar kam kiya.","We worked throughout the night."));
//
//       addItem(new CityDataItem("Humne sari raat kam kiya.","We worked throughout the night."));
//
//       addItem(new CityDataItem("Main tumhare bina kuchh nahi hun.","I am nothing without you."));
//
//       addItem(new CityDataItem("Uske bina ham akele hai.","We are alone without him."));
//
//       addItem(new CityDataItem("Keematein badh rahi hain.","Prices are rising up."));
//
//       addItem(new CityDataItem("Gubbara upar ja raha hai.","Balloon is going up."));
//
//       addItem(new CityDataItem("Pani ka star badh raha hai.","Water level is going up (rising)."));
//
//       addItem(new CityDataItem("Usne pathar upar ki taraf phenka.","He threw the stone upwards."));
//
//       addItem(new CityDataItem("Main upar ki or jaa raha hun.","I am going upwards."));
//
//       addItem(new CityDataItem("Pathar ko upar ki or phenko.","Throw the stone upwards."));
//
//       addItem(new CityDataItem("Gubbara upar ki or gaya.","Balloon went upwards."));
//
//       addItem(new CityDataItem("Usne pathar niche ki taraf phenka.","He threw the stone downwards."));
//
//       addItem(new CityDataItem("Usne niche ki or dekha.","He looked downwards."));
//
//       addItem(new CityDataItem("Wo do saal pehle aaya.","He came 2 years ago."));
//
//       addItem(new CityDataItem("Main do saal pehle yahaan tha.","I was here 2 years ago."));
//
//       addItem(new CityDataItem("Papa char din pehle aaye the.","Papa had come 4 days ago."));
//
//       addItem(new CityDataItem("Wo 36 sal pahle award jita.","He won the award 36 years ago."));
//
//       addItem(new CityDataItem("Computer ke andar kya hai?","What is there inside the computer?"));
//
//       addItem(new CityDataItem("Wah andar tha aur Main baahar tha.","He was inside and I was outside."));
//
//       addItem(new CityDataItem("Usne ghar ke andar dekha.","He looked inside the house."));
//
//       addItem(new CityDataItem("Main ghar ke andar tha.","I was inside the house."));
//
//       addItem(new CityDataItem("Wo ghar ke bahar khada tha.","He was standing outside the house."));
//
//       addItem(new CityDataItem("Wo school parisar ke bahar tha.","He was outside the school premises."));
//
//       addItem(new CityDataItem("Wo school parisar ke bahar hai.","He is outside the hospital premises."));
//
//       addItem(new CityDataItem("Vah mere bagal mein khada tha.","He was standing next to me."));
//
//       addItem(new CityDataItem("Uske piche koi nahi khada hai.","There is nobody standing behind him."));
//
//       addItem(new CityDataItem("Uske aage koi nahi khada hai.","There is no one standing ahead of him."));
//
//       addItem(new CityDataItem("Mera din achchha guzar raha h.","I’m having a good day."));
//
//       addItem(new CityDataItem("Mera time achchha kat raha hai.","I’m having a good time. "));
//
//       addItem(new CityDataItem("Car hona meri dili ichchha hai.","To have a car is my whole-hearted will."));
//
//       addItem(new CityDataItem("Wo nikal gaya hoga.","He would have left."));
//
//       addItem(new CityDataItem("Aapne use call kiya hoga.","You would have called him."));
//
//       addItem(new CityDataItem("Aap rakh lijiye ye pen.","You keep this pen."));
//
//       addItem(new CityDataItem("Mere pair mein dard hai.","I have a pain in my leg."));
//
//       addItem(new CityDataItem("Mujhe jana pad raha hai.","I am having to go."));
//
//       addItem(new CityDataItem("Rahul ko sochna pad raha hai.","Rahul is having to think."));
//
//       addItem(new CityDataItem("Hamesha ke liye rakh lijiye","Keep it forever."));
//
//       addItem(new CityDataItem("Usne khana kha liya tha.","He had eaten the food."));
//
//       addItem(new CityDataItem("Avirat burger kha raha hai.","Avirat is eating burger"));
//
//       addItem(new CityDataItem("Apke paas kitna paisa hai?","How much money do you have?"));
//
//       addItem(new CityDataItem("Lgta hai uske paas pen h.","Seems as, he has a pen."));
//
//       addItem(new CityDataItem("Hame ghar jana hoga.","We will have to go home."));
//
//       addItem(new CityDataItem("Hame samjhauta karna hoga.","We will have to compromise."));
//
//       addItem(new CityDataItem("Mujhe khelna hai.","I have to play."));
//
//       addItem(new CityDataItem("Hame nahi khelna hai.","We have not to play."));
//
//       addItem(new CityDataItem("Kya mujhe jana hai?","Have I to go?"));
//
//       addItem(new CityDataItem("Tumhare paas kya hai?","What do you have?"));
//
//       addItem(new CityDataItem("Maine khana kha liya hai.","I have eaten the food."));
//
//       addItem(new CityDataItem("Aap ye apne pas rakhiye.","You keep it with yourself. "));
//
//       addItem(new CityDataItem("Ye lijiye","Have it please."));
//
//       addItem(new CityDataItem("Aapse milne ke bad mai nikal gaya.","Having met you, I left."));
//
//       addItem(new CityDataItem("Tumhe dekhne ke baad mai tumhare sapno mein kho gaya.","Having seen you, I got lost in your dreams."));
//
//       addItem(new CityDataItem("Aisa ghar mere pas ho, mera sapna tha.","To have such a house was my dream. "));
//
//       addItem(new CityDataItem("Aisa pati milna meri  khwahish thi.","To have such a husband was my will."));
//
//       addItem(new CityDataItem("Aap jaisa adhyapak pakar main khush hun.","I am happy to have such a teacher like you."));
//
//       addItem(new CityDataItem("Aap jaisa student pana mera saubhagya hai.","I am lucky to have such a student like you."));
//
//       addItem(new CityDataItem("Tumhe pana meri zindagi ki dili khwahish rahegi.","To have you with me will remain the whole-hearted desire of my life."));
//
//       addItem(new CityDataItem("Uske paas car ho sakti hai.","He may have a car."));
//
//       addItem(new CityDataItem("Rahul ke paas shayad paise na ho.","Rahul may not have money."));
//
//       addItem(new CityDataItem("Lagta hai tumhare paas dimag nahi hai.","It seems that you don’t have brain."));
//
//       addItem(new CityDataItem("Aapse mile hue mujhe do saal ho gaye hai.","It has been 2 years to me having met you."));
//
//       addItem(new CityDataItem("Sath khele hue  kafi samay ho gaya.","It has been a long having played together."));
//
//       addItem(new CityDataItem("Paisa hona achi baat hai par ghamand nahi hona chahiye.","It is good to have money but there should not be arrogance."));
//
//       addItem(new CityDataItem("Ho sakta hai uske paas kitab ho.","He may have a book."));
//
//       addItem(new CityDataItem("Aasman mein kitne taare hai?","How many stars are there in the sky?"));
//
//       addItem(new CityDataItem("Glass me kitna paani tha?","How much water was there in the glass?"));
//
//       addItem(new CityDataItem("Mujhe fizul main aap se sawal puchne padh rahe hai.","I am having to ask you questions for no reason. "));
//
//       addItem(new CityDataItem("Hame bheja Ja Raha hai.","We are being sent."));
//
//       addItem(new CityDataItem("Rahul  swarthi ho raha hai. ","Rahul is being selfish."));
//
//       addItem(new CityDataItem("Mujhe bataya gaya tha.","I had been told."));
//
//       addItem(new CityDataItem("I had been told.","He is my to-be husband."));
//
//       addItem(new CityDataItem("Wo ghar par hona chahiye","He should be at home."));
//
//       addItem(new CityDataItem("Hame Khush Kiya ja raha hai.","We are being made happy. "));
//
//       addItem(new CityDataItem("Aap thake Huye Lagte hain.","You seem to be tired."));
//
//       addItem(new CityDataItem("Swarthi mat baniye.","Don’t be selfish."));
//
//       addItem(new CityDataItem("Ye Kaam Kiya jana hai","This work is to be done."));
//
//       addItem(new CityDataItem("Wo Delhi mein kabhi nahi raha hai.","He has never been in Delhi."));
//
//       addItem(new CityDataItem("Aapko Poocha Jana chahiye tha.","You should have been asked."));
//
//       addItem(new CityDataItem("Use  Mumbai nahi bheja Ja saka.","He could not be sent to Mumbai."));
//
//       addItem(new CityDataItem("Wo badal raha hai.","He is being /getting changed."));
//
//       addItem(new CityDataItem("Mai thak raha hun.","I am being / getting tired."));
//
//       addItem(new CityDataItem("Use bheja ja raha Hoga.","He will be getting sent."));
//
//       addItem(new CityDataItem("Kamron ko saaf Kiya jana hai.","The rooms are to be cleaned."));
//
//       addItem(new CityDataItem("Kamre ko saaf Kiya ja raha tha.","The room was being cleaned."));
//
//       addItem(new CityDataItem("Kaha gaya ki building Banai Jaani hai.","The building was said to be constructed."));
//
//       addItem(new CityDataItem("Paise Ke maamle mein swarthi bano.","Be selfish for money matters."));
//
//       addItem(new CityDataItem("Mujhe 6:00 baje tak office mein hi Rehna Hai.","I have to be in office itself till 6 o’clock."));
//
//       addItem(new CityDataItem("Use ghar par rehne ke liye Kaha gaya hai.","He has been told to be at home."));
//
//       addItem(new CityDataItem("Use Naukri se kyun nikala Gaya?","Why was he fired from the job?"));
//
//       addItem(new CityDataItem("Bachcho ko school mein khilaune Diye Gaye.","Kids were given toys in school."));
//
//       addItem(new CityDataItem("Aapse police ke dwara puchtach ki Jani hai.","You have to be interrogated by the police."));
//
//       addItem(new CityDataItem("Wo Mere Pitne ke bare mein baat kar rahe the","They were talking about my being beaten."));
//
//       addItem(new CityDataItem("Pakde jaane ke dar se wo dara hua tha.","He was scared of being caught."));
//
//       addItem(new CityDataItem("Kabhi kabhi Swarthi Hona acha Hota Hai.","Being selfish at times is fair."));
//
//       addItem(new CityDataItem("Is wakt ghar par hona mere liye zaruri hai.","Being at home is important for me right now."));
//
//       addItem(new CityDataItem("Main apse milne ko Betab ho raha hun.","I am being impatient/crazy to meet you."));
//
//       addItem(new CityDataItem("Mujhe team Mein khelne nahi diya ja raha hai.","I am not being let play in the team."));
//
//       addItem(new CityDataItem("Meri Shadi ko 5 saal ho gaye hai.","It has been 5 year to my marriage."));
//
//       addItem(new CityDataItem("Dant khane ke baad wo dukhi ho gya.","Having been scolded, he turned/got sad."));
//
//       addItem(new CityDataItem("Ek adyapak hone ke naate ye mera farz hai.","Being a teacher, it is my duty."));
//
//       addItem(new CityDataItem("Wo ghar par rehna pasand karta hai.","He loves being at home."));
//
//       addItem(new CityDataItem("Ghar par hone ki wajah se mai apse mil paya.","I could meet you due to being at home."));
//
//       addItem(new CityDataItem("Yuddh mein maare jaane ki kya sambhavna hai?","What is the possibility of being killed in the war?"));
//
//       addItem(new CityDataItem("Aapke daant khane ki kya Sambhavna hai?","What is the chance of your being scolded?"));
//
//       addItem(new CityDataItem("Ek adyapak hone ke naate ye mera farz hai.","Being a teacher, it is my duty."));
//
//       addItem(new CityDataItem("Being a teacher, it is my duty.","He loves being at home."));
//
//       addItem(new CityDataItem("Ghar par hone ki wajah se mai apse mil paya.","I could meet you due to being at home."));
//
//       addItem(new CityDataItem("Yuddh mein maare jaane ki kya sambhavna hai?","What is the possibility of being killed in the war?"));
//
//       addItem(new CityDataItem("Aapke daant khane ki kya Sambhavna hai?","What is the chance of your being scolded?"));
//
//       addItem(new CityDataItem("Wo Mujhe Peetne ke bare mein baat kar rahe the.","They were talking about beating me."));
//
//       addItem(new CityDataItem("Mujhe Shaam 7:00 baje tak office me rehne ka aadesh kiya gaya tha.","I had been instructed to stay/be in office till 7 PM."));
//
//       addItem(new CityDataItem("Hame police ke dwara bahut Buri Tarah Pratadit kiya Gaya.","We were tortured very badly by the police."));
//
//       addItem(new CityDataItem("Aapko jhoot bola gaya tha ki aaj meri Shaadi hai","You had been told a lie that it was my marriage that"));
//
//       addItem(new CityDataItem("Usne mujhe Tumhare bhai ke dwara madad kiye jane ke bare mein Bataya.","He told me about having been helped by your brother."));
//
//       addItem(new CityDataItem("Wo Tumhare Pitne ke bare mein baat kar rahe hai.","They are talking about your being beaten."));
//
//       addItem(new CityDataItem("Tumhare sath Hona Meri Zindagi Ki Sabse Badi uplabdhi hai","Being with you is the biggest achievement of my life."));
//
//       addItem(new CityDataItem("Aarop Lagaye jane ke bad usne Nirdosh vyavahar karna Shuru kar diya.","Having been accused, he started behaving innocent."));
//
//       addItem(new CityDataItem("Aapka school mein Hona Kitna maayne Rakhta hai?","How important is it for you being in school?"));
//
//       addItem(new CityDataItem("Main nahi gaya.","I didn’t go."));
//
//       addItem(new CityDataItem("Tum kaha jaate ho?","Where do you go?"));
//
//       addItem(new CityDataItem("Hum kis tarah aayenge?","How will we come?"));
//
//       addItem(new CityDataItem("Main kab tak tumhara saath doonga?","How long will I support you?"));
//
//       addItem(new CityDataItem("Vo kis shahar se aaya tha?","From which city had he come?"));
//
//       addItem(new CityDataItem("Vo ladka aisa kyon sochta hai?","Why does that boy think so?"));
//
//       addItem(new CityDataItem("Ye bachche kaha rahte hai?","Where do these children live?"));
//
//       addItem(new CityDataItem("Vo kal se dance abhyaas kr rahi hai.","She’s been practicing dance since yesterday."));
//
//       addItem(new CityDataItem("Ghav se khoon nikal raha hai.","Blood is oozing from the wound."));
//
//       addItem(new CityDataItem("Main padhoonga.","I will study."));
//
//       addItem(new CityDataItem("Vo sabhi kiske bhai hai?","Whose brothers are they all?"));
//
//       addItem(new CityDataItem("Vo khidkee se jhaank raha tha.","He was peeping through the window."));
//
//       addItem(new CityDataItem("Bachche tab school se aa rahe honge.","Children will be coming from school then."));
//
//       addItem(new CityDataItem("Main shimla aksar jata hoon.","Main shimla aksar jata hoon."));
//
//       addItem(new CityDataItem("Vo khoob padhta hai.","He studies a lot."));
//
//       addItem(new CityDataItem("Vo kabhi-kabhi mere ghar aata hai.","He sometimes comes my home."));
//
//       addItem(new CityDataItem("Kal 6 baje bus nikal chuki hogi.","Bus will have left by 6 o’clock tomorrow."));
//
//       addItem(new CityDataItem("Tum kab tak yaha thahroge?","For how long will you stay here?"));
//
//       addItem(new CityDataItem("Ma apne bachche ko doodh pila rahi hogi.","The mother will be feeding her child."));
//
//       addItem(new CityDataItem("Hum bahut der tak sote hai.","We sleep till late."));
//
//       addItem(new CityDataItem("Vo ghar se nahi aaya hai.","He has not come from home."));
//
//       addItem(new CityDataItem("Vo apne sapno ko saakaar karega.","He will fulfill his dreams."));
//
//       addItem(new CityDataItem("Main kiske bare mein sochta hoon?","Whom do I think about?"));
//
//       addItem(new CityDataItem("Main aur tum kiske saath khel rahe the?","With whom were I & you playing?"));
//
//       addItem(new CityDataItem("Hum vaha gaye the.","We had gone there."));
//
//       addItem(new CityDataItem("Mera dost kaun si car chala raha hai?","Which car is my friend driving?"));
//
//       addItem(new CityDataItem("Usne us admi ko jaan se maar diya.","He killed that man."));
//
//       addItem(new CityDataItem("Mere saath kai film dekh rahe the.)","There were many, watching movie with me"));
//
//       addItem(new CityDataItem("Humne TV mein kiski ladai dekhi?","Whose fight did we watch on TV?"));
//
//       addItem(new CityDataItem("Hum Ram ko bilkul nahi jante.","We don’t know Ram at all."));
//
//       addItem(new CityDataItem("Ye toota hua dil kuch keh raha hai.","This broken heart is saying something."));
//
//       addItem(new CityDataItem("Tum bahut tej daud rahe the.","You were running very fast."));
//
//       addItem(new CityDataItem("Kaun jaayega?","Who will go?"));
//
//       addItem(new CityDataItem("Kis hero ka dost tumhare papa ke saath job karta hai?","Which actor’s friend works with your dad?"));
//
//       addItem(new CityDataItem("Main aksar uske ghar jata hoon.","I often go to his home."));
//
//       addItem(new CityDataItem("Seema aaye din tumhe homework likhne ke liye bulati hai.","Seema often calls you to write homework."));
//
//       addItem(new CityDataItem("Bachche subah se TV dekh rahe hai","Kids have been watching TV since morning."));
//
//       addItem(new CityDataItem("Use kis party ka saath nahi mil raha hai ?","Which party’s support is he not getting? "));
//
//       addItem(new CityDataItem("Vo mobile se kya dekh raha hai?","What is he watching on Mobile?"));
//
//       addItem(new CityDataItem("Main kis ladki ka bhai hoon?","Which girl’s brother am I?"));
//
//       addItem(new CityDataItem("Uske papa ne mujhse baat karna pasand kyon nahi kiya?","Why did his father not prefer/like to talk to me?"));
//
//       addItem(new CityDataItem("Kya ye batein yaad aayengi tumhein?","Will you remember these words?"));
//
//       addItem(new CityDataItem("Hum sabhi log us neta ko pasand nahi karte","We all people don’t like that leader"));
//
//       addItem(new CityDataItem("Mere bhai ne kisi ladki ko pareshan nahi kiya.","My brother didn’t bother any girl."));
//
//       addItem(new CityDataItem("Usne dekhne ki koshish nahi ki.","He didn’t try to see."));
//
//       addItem(new CityDataItem("Usne mere liye kabhi kuch kiya?","Did he ever do anything for me?"));
//
//       addItem(new CityDataItem("Usne kuch nahi kiya.","He did nothing."));
//
//       addItem(new CityDataItem("Hum tumhare saath ghoomne jayenge.","We will go for a walk with you."));
//
//       addItem(new CityDataItem("Tumne mera dil dukhaya hai.","You have hurt me."));
//
//       addItem(new CityDataItem("Aankhen dhokha deti hai.","Eyes are deceptive."));
//
//       addItem(new CityDataItem("Kya tumne sabhi ko khana paros diya hai?","Have you served the food to all?"));
//
//       addItem(new CityDataItem("Kisne tumhen dekha tha?","Who had seen you?"));
//
//       addItem(new CityDataItem("Ye dil pyar ke liye tadapta hai.","This heart craves for love."));
//
//       addItem(new CityDataItem("Maine bhagvaan se kuch manga hai.","I have begged something from God."));
//
//       addItem(new CityDataItem("Usne galti ki hai.","made a mistake."));
//
//       addItem(new CityDataItem("Hamari aankhen use dekh rahi thi.","Our eyes were searching him."));
//
//       addItem(new CityDataItem("Kisne tumhein chot pahunchai?","Who hurt you?"));
//
//       addItem(new CityDataItem("Maine aisa kabhi nahi socha.","I never thought so."));
//
//       addItem(new CityDataItem("Dukandaar ne mujhe loot liya.","Shopkeeper ripped me off."));
//
//       addItem(new CityDataItem("Kya tum mujhe yaad dilaoge?","Will you remind me?"));
//
//       addItem(new CityDataItem("Bure daur mein tumhara saath kisne diya?","Who supported you in bad phase?"));
//
//       addItem(new CityDataItem("Maa badle mein kuch nahi mangatee.","Mother demands nothing in return."));
//
//       addItem(new CityDataItem("Hum 2:00 baje park mein ghoom rahe the.","We were walking in the park at 2 o’clock."));
//
//       addItem(new CityDataItem("Vo kiske liye itni door gaya?","For whom did he go this far?"));
//
//       addItem(new CityDataItem("For whom did he go this far?","Your face reminds me of someone."));
//
//       addItem(new CityDataItem("Ye kaun karta hai?","Who does it?"));
//
//       addItem(new CityDataItem("Usne kitaab le lee thi.","He had taken the book."));
//
//       addItem(new CityDataItem("Main pen se likhoonga.","I will write with a pen."));
//
//       addItem(new CityDataItem("Vo ghoomne gaya tha.","He had gone for a walk."));
//
//       addItem(new CityDataItem("Ye kaam kisne kiya?","Who did this work?"));
//
//       addItem(new CityDataItem("Ye kahaniyan mujhe pasand nahi.","I don’t like these stories."));
//
//       addItem(new CityDataItem("Humne galti nahi ki.","We didn’t make a mistake."));
//
//       addItem(new CityDataItem("Vo dono hame kya sikhaenge?","What will they both teach us?"));
//
//       addItem(new CityDataItem("Tum sabhya lagate ho.","You look civilized."));
//
//       addItem(new CityDataItem("Vo tumhare ghar pahle hi aa chuka hai.","He has already come your home."));
//
//       addItem(new CityDataItem("Main tumhein roz dekhne aaya.","I came to see you daily."));
//
//       addItem(new CityDataItem("Tum apni galti sveekaar kar chuke ho.","You have accepted your fault."));
//
//       addItem(new CityDataItem("Main tumse kabhi nahi mila.","I never met you."));
//
//       addItem(new CityDataItem("Main kisi tarah office pahuncha hoon.","I have somehow reached office."));
//
//       addItem(new CityDataItem("Kya aap humse kuch kah rahe hai?","Are you saying something to us?"));
//
//       addItem(new CityDataItem("Vo tumhare ghar ki taraf kyon aata hai?","Why does he come towards your home?"));
//
//       addItem(new CityDataItem("Main deevaar ke peeche chup gaya.","I hid behind the wall."));
//
//       addItem(new CityDataItem("Main tumse milne ko pagal ho raha tha.","I was craving to meet you."));
//
//       addItem(new CityDataItem("Main jald hi office pahunch raha hoon.","I am reaching office soon."));
//
//       addItem(new CityDataItem("Tum ache lag rahe ho.","You are looking good."));
//
//       addItem(new CityDataItem("Tumne aisa kyon socha?","Why did you think so?"));
//
//       addItem(new CityDataItem("Usne gana kaha gaaya?","Where did he sing the song?"));
//
//       addItem(new CityDataItem("Priya mere dil ko samajh rahi thi.)","Priya was understanding my feelings."));
//
//       addItem(new CityDataItem("Maine sab kuch samjh liya tha.","I had understood everything."));
//
//       addItem(new CityDataItem("Log mithaiyaan kha chuke the.","People had eaten the sweets."));
//
//       addItem(new CityDataItem("Mujhe uski yaad aa rahi thi.","I was missing him/her."));
//
//       addItem(new CityDataItem("Vah do saal pahle company chhod chuka hai.","He has left the company 2 years ago."));
//
//       addItem(new CityDataItem("Vo tumhe dhamkee kyon deta hai?","Why does he threaten you?"));
//
//       addItem(new CityDataItem("Main office ke bahar pahle hi dekh chuka hoon.","I have already seen outside the office."));
//
//       addItem(new CityDataItem("Kya aap humse sahmat hai?","Do you agree with us?"));
//
//       addItem(new CityDataItem("Vo admi mujhse nahi milta hai.","That man does not meet me."));
//
//       addItem(new CityDataItem("Vo tumhara intezaar 2:00 baje se kar raha tha.","He had been waiting for you since 2’o’clock."));
//
//       addItem(new CityDataItem("Main tumhare bare mein kuch nahi soch raha hoon.","I am not thinking anything about you."));
//
//       addItem(new CityDataItem("Main tumse baat karoonga.","I will talk to you."));
//
//       addItem(new CityDataItem("Log mujhse milne nahi aayenge.","People will not come to meet me."));
//
//       addItem(new CityDataItem("Tumhare baal jhad chuke the.","You suffered a hair fall."));
//
//       addItem(new CityDataItem("Main apne mata pita ko vida kar chuka hoon.","I have seen off my parents."));
//
//       addItem(new CityDataItem("2 ghante ho gaye, ghaav se khoon nikal raha hai.","Blood has been oozing from the wound for 2 hrs."));
//
//       addItem(new CityDataItem("Main apne mata-pita ko bhej chuka tha.","I had sent my parents."));
//
//       addItem(new CityDataItem("Kya aap 3 saal se kaam kar rahe hai?","Have you been working for 3 years?"));
//
//       addItem(new CityDataItem("Kya aap subah se ghoom rahe hai?","Have you been walking since morning?"));
//
//       addItem(new CityDataItem("Nal dikhne mein achha lag raha tha.","The tap was looking good."));
//
//       addItem(new CityDataItem("Usne tumhein dhamkee kyo dee thee?","Why had he threatened you?"));
//
//       addItem(new CityDataItem("Tum mujhe subah se kyo dhundh rahe ho?","Why have you been searching me since morning?"));
//
//       addItem(new CityDataItem("Usne mujhe akela chhod diya hai.","He has left me alone."));
//
//       addItem(new CityDataItem("Tum aisa kyon sochte ho?","Why do you think so?"));
//
//       addItem(new CityDataItem("Main aapke paas kab aaya?","When did I come to you?"));
//
//       addItem(new CityDataItem("Main tumse kabhi nahi milunga.","I will never meet you."));
//
//       addItem(new CityDataItem("kya apne khana khaya?","Did you eat the food?"));
//
//       addItem(new CityDataItem("Vo bhagvaan ki pooja kab se kr rahi hai?","Since when has she been worshipping God?"));
//
//       addItem(new CityDataItem("Tumne haal hi mein kaun si film dekhi hai?","Which movie have you recently seen?"));
//
//       addItem(new CityDataItem("Main ghoomne gaya.","I went for a walk."));
//
//       addItem(new CityDataItem("Main 2 hour se thand se kaamp raha hoon.","I have been shivering with cold for 2 hours."));
//
//       addItem(new CityDataItem("Vah 2 saal pahle company chhod chuka hai.","He has left the company 2 years ago."));
//
//       addItem(new CityDataItem("Tumne mera mood kharaab kiya.","You spoiled my mood."));
//
//       addItem(new CityDataItem("Mein 2008 se company me kaam kr rha hu","I have been working with the company since 2008."));
//
//       addItem(new CityDataItem("Vo gaana kaha gata hai?","Where does he sing the song?"));
//
//       addItem(new CityDataItem("Vo tumhare ghar me khana kha chuka hai?","He has eaten the food at your home."));
//
//       addItem(new CityDataItem("Jab main aaoonga, tum ghar ja rahe honge.","When I come, you will be going home."));
//
//       addItem(new CityDataItem("Usne mujhe maaf kiya.","He forgave me."));
//
//       addItem(new CityDataItem("Main office parisar mein cigarette nahi peeta.","I don’t smoke in office premises."));
//
//       addItem(new CityDataItem("Main apni galtee mahasoos kar chuka hoon.","I have realized my mistake."));
//
//       addItem(new CityDataItem("Maine ye paheli suljha di.)","I unravelled this enigma."));
//
//       addItem(new CityDataItem("Main kabhi gaana nahi gata.","I never sing a song."));
//
//       addItem(new CityDataItem("Main aapke pass kab aaunga?","When will I come to you?"));
//
//       addItem(new CityDataItem("Mera bhai kisi tarah ghar pahuncha.","My brother somehow reached home."));
//
//       addItem(new CityDataItem("Yah sunne mein acha lagta hai.","It sounds good."));
//
//       addItem(new CityDataItem("Sachin ne purane sabhi records tode.","Sachin broke all the previous records."));
//
//       addItem(new CityDataItem("Main apka prastaav sveekaar karta hoon.","I accept your proposal."));
//
//       addItem(new CityDataItem("Kya Seeta vaha baithatee hai?","Does Seeta sit there?"));
//
//       addItem(new CityDataItem("Tum aise kyon soch rahe ho?","Why are you thinking so?"));
//
//       addItem(new CityDataItem("Tum ache lagte ho.","You look good."));
//
//       addItem(new CityDataItem("Tum itni saree kitabein kaise laoge?","How will you bring these many books?"));
//
//       addItem(new CityDataItem("Usne shadyantra ka bhanda phod diya.","He unearthed the conspiracy."));
//
//       addItem(new CityDataItem("Main apni safalta ka shrey tumhe deta hoon.","I ascribe my success to you."));
//
//       addItem(new CityDataItem("Tum me se kitne tajmahal gaye ho?","How many of you have visited the Taj?"));
//
//       addItem(new CityDataItem("Maine tumhare liye prarthana ki thi.","I had prayed for you."));
//
//       addItem(new CityDataItem("Ye kisne kiya?","Who did it?"));
//
//       addItem(new CityDataItem("Usne anjane mein mujhe dukh pahuchaya.","He unknowingly hurt me."));
//
//       addItem(new CityDataItem("Maine logo se paise ikatthe kar liye hai.","I have collected the money from people."));
//
//       addItem(new CityDataItem("Main kasam khata hoon ki main Vaha kabhi nahi jaoonga.","I swear that I will never go there."));
//
//       addItem(new CityDataItem("Tumhari kitaab kisne li?","Who took your book?"));
//
//       addItem(new CityDataItem("Kya hua?","What happened?"));
//
//       addItem(new CityDataItem("Tumhare dimaag ko kisne pareshan kiya?","What disturbed your mind?"));
//
//       addItem(new CityDataItem("Hum bevajah ek dusre se lad rahe the.","We were unnecessarily fighting with each other."));
//
//       addItem(new CityDataItem("Tum kya dhoondh rahe ho?","What are you looking for?"));
//
//       addItem(new CityDataItem("Maine uski awaaz pehchan li.","I recognized his voice."));
//
//       addItem(new CityDataItem("Usne mujhe poori tarah se sahayog ka aashvaasan diya.","He assured me of full cooperation."));
//
//       addItem(new CityDataItem("Kya tumme se koai pooja karte hain?","Do any of you worship?"));
//
//       addItem(new CityDataItem("Usne itne sare logo ko kaise sambhala?","How did he handle these many people?"));
//
//       addItem(new CityDataItem("Jo koi mere pass aaya, maine madad ki.","Whoever came to me, I helped."));
//
//       addItem(new CityDataItem("Khel ke dauraan vo khoya khoya sa laga.","During the game, he seemed to be lost."));
//
//       addItem(new CityDataItem("Tum kaheen khoye se lagte ho.","You seem to be lost somewhere."));
//
//       addItem(new CityDataItem("Maine use utana paisa nahi diya.","I didn’t give him that much money."));
//
//       addItem(new CityDataItem("Hajaron log sadak par vidroh kar rahe hai.","Thousands of people are protesting on roads."));
//
//       addItem(new CityDataItem("Hast rekha vigyaan ne use pagal kar diya hai.","Palmistry has made him crazy."));
//
//       addItem(new CityDataItem("Yeh dukaan Ravivar ko chhodkar sabhi din khulti hai.","This shop opens every day except Sunday."));
//
//       addItem(new CityDataItem("Tumhre alawa Me kisi ko bhi daant skta hu.","I can scold anyone except you."));
//
//       addItem(new CityDataItem("(Mere pas Samsung ke alawa kai companies ke mobile hai.","Except Samsung, I have mobiles of many companies."));
//
//       addItem(new CityDataItem("Ise chhodkar mujhe kuch bhi de do.","Give me anything except it."));
//
//       addItem(new CityDataItem("Iske atirikt kuch aur khate ho kya?","Do you eat anything else besides this?"));
//
//       addItem(new CityDataItem("Is pen ke alawa mere pas do pen hai.","Besides this pen, I have two more pens."));
//
//       addItem(new CityDataItem("Aman ke alawa mere pas Ashish bhi to hai.","Besides Aman, I have Ashish as well."));
//
//       addItem(new CityDataItem("Tumhare atirikt mere pas kaun hai?","Who do I have besides you?"));
//
//       addItem(new CityDataItem("Chhuttiyon ke dauran Main Delhi mein tha.","I was in Delhi during the vacation."));
//
//       addItem(new CityDataItem("Hum break ke dauran Sachin se mil sakte h.","We can meet Sachin during the break."));
//
//       addItem(new CityDataItem("Maine padhai ke dauran naukari ki.","I worked during studies."));
//
//       addItem(new CityDataItem("We Delhi ke daure ke dauran aaye.","He came during the visit of Delhi."));
//
//       addItem(new CityDataItem("Main 9 baje tak kam karunga.","I will work till 9."));
//
//       addItem(new CityDataItem("Hum somvaar tak thahare.","We stayed till Monday."));
//
//       addItem(new CityDataItem("Main shanivaar tak wahan tha.","I was there till Saturday."));
//
//       addItem(new CityDataItem("Main 2009 tak wahan tha.","I was there till 2009."));
//
//       addItem(new CityDataItem("Lota ludakte ludakte ludak gaya.","The metal pot (vessel) kept rolling and fell down."));
//
//       addItem(new CityDataItem("Lota ludakte ludakte girne se bach gaya.","The metal pot kept rolling but escaped falling."));
//
//       addItem(new CityDataItem("Main girne se bach gaya.","I escaped falling."));
//
//       addItem(new CityDataItem("Main girte girte bacha.","I narrowly escaped falling."));
//
//       addItem(new CityDataItem("Wo swimming pul me girte girte bach gaya.","He narrowly escaped falling into the swimming pool."));
//
//       addItem(new CityDataItem("Wo cycle se girte girte bacha.","He narrowly escaped falling off the bicycle."));
//
//       addItem(new CityDataItem("Vo paas hote hote rah gaya.","He narrowly missed the pass marks."));
//
//       addItem(new CityDataItem("Glass mere haath se slip ho gaya or ludakne laga.","The glass slipped out of my hands and started rolling."));
//
//       addItem(new CityDataItem("Ye mere dimaag se nikal gaya.","It slipped out of my mind."));
//
//       addItem(new CityDataItem("Mujhe Sabziyan bhi laani thi. Dimag se nikal gaya.","I had to bring vegetables too."));
//
//       addItem(new CityDataItem("Chinta mat karo. Maine tumhare liye 2 kele bachakar rakhe hain.","Don’t worry. I have spared 2 bananas for you."));
//
//       addItem(new CityDataItem("Chala jaye?","Chinta mat karo. Maine tumhare liye 2 kele bachakar rakhe hain."));
//
//       addItem(new CityDataItem("Chala jaye?","Shall we go?"));
//
//       addItem(new CityDataItem("Khaaya jaye?","Shall we eat? "));
//
//       addItem(new CityDataItem("Main 13 June ko us shahar me fans gaya tha.","I had been stuck in that city on 13th of June."));
//
//       addItem(new CityDataItem("Mai chahkar bhi usse mil nahi saka.","I wished to meet her but I couldn’t."));
//
//       addItem(new CityDataItem("Pani ab garam hai. Aap nahane jaiye.","Water is warm now. You go and take a bath."));
//
//       addItem(new CityDataItem("Pani gunguna ho gaya hai.","The water has turned lukewarm."));
//
//       addItem(new CityDataItem("Mene kisi ka kya bigada hai?","What wrong have I done to anyone?"));
//
//       addItem(new CityDataItem("Tumne mera kya bigada hai?","What wrong have you done to me?"));
//
//       addItem(new CityDataItem("Mene uska kya bigada hai?","What wrong have I done to him?"));
//
//       addItem(new CityDataItem("Aisa mere saath hi kyo hota hai?","Why does it happen only with me?"));
//
//       addItem(new CityDataItem("Main tair ke nadi par kar sakata hun.","I can swim across the river."));
//
//       addItem(new CityDataItem("kya aap school ja paye?","Could you go to school?"));
//
//       addItem(new CityDataItem("kya vo ghar aa paya?","Could he come home?"));
//
//       addItem(new CityDataItem("aap mere ghar aa sakte the.","You could have come my home."));
//
//       addItem(new CityDataItem("aapako apane doston se bat karani chaahie.","You Should talk to your friends."));
//
//       addItem(new CityDataItem("aapko mujhe phone nahin karna chahiye.","You shouldn’t call me."));
//
//       addItem(new CityDataItem("mujhe vahan jarur jana chaahie.","I must go there."));
//
//       addItem(new CityDataItem("Mera ghar sadak ke us paar hai.","My house is across the road."));
//
//       addItem(new CityDataItem("Wo sadak ke paar khada hai.","He is standing across the road."));
//
//       addItem(new CityDataItem("hamen apne desh ke lie ladana chahiye","We ought to fight for our nation."));
//
//       addItem(new CityDataItem("use apne desh ke liye ladna chahiye tha.","He ought to have fought for his nation."));
//
//       addItem(new CityDataItem("kya main rahul se bat kar sakta hun?","Could I talk to Rahul please?"));
//
//       addItem(new CityDataItem("kya main apke sath baith sakta hun.","May I sit with you?"));
//
//       addItem(new CityDataItem("rahul ko jana hai.","Rahul has to go."));
//
//       addItem(new CityDataItem("ye ek pakki sadak hai.","This is a metalled road."));
//
//       addItem(new CityDataItem("ye ek kachchi sadak hai.","This is an unmetalled road."));
//
//       addItem(new CityDataItem("aap mere kaun ho?","Who are you to me?"));
//
//       addItem(new CityDataItem("kash main ek ladaki hota","I wish I were a girl!"));
//
//       addItem(new CityDataItem("kash main ek guitarist hota","I wish I were a guitarist!"));
//
//       addItem(new CityDataItem("kash mere pas paise hote","I wish I had money!"));
//
//       addItem(new CityDataItem("kash main vahan ja sakata","I wish I could go there!"));
//
//       addItem(new CityDataItem("aisa sochana bhi mat.","Don’t even think so."));
//
//       addItem(new CityDataItem("ye karana galat hai.","This is wrong to do it."));
//
//       addItem(new CityDataItem("baarish hone do.","Let it rain."));
//
//       addItem(new CityDataItem("Mere per me dard hai.","There is a pain in my leg. "));
//
//       addItem(new CityDataItem("Meri ungli me dard hai.","There is a pain in my finger. "));
//
//       addItem(new CityDataItem("Andar se chair le ke aao.","Bring the chair from inside."));
//
//       addItem(new CityDataItem("Chair andar rakho.","Keep the chair inside."));
//
//       addItem(new CityDataItem("Tumhe dant padegi. ","You will be scolded."));
//
//       addItem(new CityDataItem("Main mobile bahut chalata hun.","I use mobile a lot."));
//
//       addItem(new CityDataItem("Main laptop bahut chalata hun.","I work on laptop a lot."));
//
//       addItem(new CityDataItem("Mai bike bahut chalata hu.","I ride the bike a lot."));
//
//       addItem(new CityDataItem("mainne jute utare .","I took off the shoes."));
//
//       addItem(new CityDataItem("badh ne tabahi  macha di.","The flood created havoc."));
//
//       addItem(new CityDataItem("unhonne vahan tabahi  macha di. ","They created havoc there."));
//
//       addItem(new CityDataItem("pure din main vyast tha","Throughout the day, I was busy."));
//
//       addItem(new CityDataItem("darvaje ko aadha khula chhod do.","Leave the door ajar."));
//
//       addItem(new CityDataItem("main kathputli nahi hun.","I am not a puppet."));
//
//       addItem(new CityDataItem("ye pyar nhi aakarshan hai.","It’s not love but infatuation."));
//
//       addItem(new CityDataItem("vo bahut gahri nind me hai.","He is having a sound sleep."));
//
//       addItem(new CityDataItem("sumit yahan hai.","Sumit is here."));
//
//       addItem(new CityDataItem("sumit yahi par hai.","Sumit is very much here."));
//
//       addItem(new CityDataItem("yah gairkanooni kaam hai","This is an illegal act."));
//
//       addItem(new CityDataItem("buri aadatein chhod do","Give up bad habits."));
//
//       addItem(new CityDataItem("kya tum tair sakate ho?","Can you swim?"));
//
//       addItem(new CityDataItem("Is glass ko mat todo.","Don’t break this glass."));
//
//       addItem(new CityDataItem("ve phool tod rahe the","They were plucking flowers."));
//
//       addItem(new CityDataItem("kisi ko gali mat do","Don’t abuse anybody."));
//
//       addItem(new CityDataItem("aap mere gawah hain","You are my witness."));
//
//       addItem(new CityDataItem("yah kanoon ke viruddh hai","It’s against the law."));
//
//       addItem(new CityDataItem("kya ye fool murjhate nahi?","Do these flowers not fade?"));
//
//       addItem(new CityDataItem("Aap joote polish krte ho na","You polish shoes, right?"));
//
//       addItem(new CityDataItem("aapki meharbani hai","So kind of you."));
//
//       addItem(new CityDataItem("bahut khushi se!","With great pleasure!"));
//
//       addItem(new CityDataItem("Mujhe galat na samajhein.","Mujhe galat na samajhein."));
//
//       addItem(new CityDataItem("Main bahut aabhari hun","I am highly obliged."));
//
//       addItem(new CityDataItem("uski aatma ko shaanti mile!","May his soul rest in peace!"));
//
//       addItem(new CityDataItem("Main roz ek seb khata hun","I eat an apple daily."));
//
//       addItem(new CityDataItem("Kaun nahi jata hai?","Who doesn’t go?"));
//
//       addItem(new CityDataItem("Kaun kaun nahi jate hain?","Who all don’t go?"));
//
//       addItem(new CityDataItem("vah mere saath padhta tha","He was my class-fellow"));
//
//       addItem(new CityDataItem("krpaya ek glass paani laaie","Please bring a glass of water."));
//
//       addItem(new CityDataItem("koi aapko bula raha hai","Somebody is calling you."));
//
//       addItem(new CityDataItem("aap bahut der laga rahe hai","You are taking too long."));
//
//       addItem(new CityDataItem("aap kaha kaam karte hain?","Where do you work?"));
//
//       addItem(new CityDataItem("khushi to mujhe hui hai)","Pleasure is all mine."));
//
//       addItem(new CityDataItem("Saari galati aapki hai.","It’s all your fault."));
//
//       addItem(new CityDataItem("Nal band kar do)","Turn the tap off."));
//
//       addItem(new CityDataItem("Nal khol do","Turn the tap on."));
//
//       addItem(new CityDataItem("Lamp bujha do.","Put out the lamp."));
//
//       addItem(new CityDataItem("Lamp jalaa do","Light the lamp."));
//
//       addItem(new CityDataItem("Ganbhir bano.","Be serious."));
//
//       addItem(new CityDataItem("Haan zarur!","Certainly!"));
//
//       addItem(new CityDataItem("Ise saaf karo.","Clean it."));
//
//       addItem(new CityDataItem("Ab chahe jo ho!","Come what may!"));
//
//       addItem(new CityDataItem("Koi bat nahi.","It’s all right."));
//
//       addItem(new CityDataItem("Shararti mat bano.","Don’t be naughty."));
//
//       addItem(new CityDataItem("Yah bahut dur hai.","It’s quite far."));
//
//       addItem(new CityDataItem("Turant jao.","Go at once. "));
//
//       addItem(new CityDataItem("Dur jao.","Go away."));
//
//       addItem(new CityDataItem("Seedhe jaana.","Go Straight."));
//
//       addItem(new CityDataItem("Koi bat nahi.","No problem."));
//
//       addItem(new CityDataItem("Nahi kabhi nahi.","Not at all."));
//
//       addItem(new CityDataItem("Aur kuch nahi.","Nothing else."));
//
//       addItem(new CityDataItem("Koi khas bat nahi.","Nothing special."));
//
//       addItem(new CityDataItem("Bharosa rakhe.","Rest Assured."));
//
//       addItem(new CityDataItem("Fir milenge.","See you again."));
//
//       addItem(new CityDataItem("Kal milenge.","See you tomorrow."));
//
//       addItem(new CityDataItem("Dur le  jao","Take away."));
//
//       addItem(new CityDataItem("Bhagwan ka shukr hai!","Thank God!"));
//
//       addItem(new CityDataItem("Sammaan dene ke liye dhanyawad.","Thanks for the honour."));
//
//       addItem(new CityDataItem("Ye bahut hai.","This is much."));
//
//       addItem(new CityDataItem("Ye bahut zyaada hai.","This is too much."));
//
//       addItem(new CityDataItem("Bahar intezar karo.","Wait outside please."));
//
//       addItem(new CityDataItem("Bachche carrom khelte hai.","Children play carrom."));
//
//       addItem(new CityDataItem("Kya tum use pahchante ho?","Do you recognize him ?"));
//
//       addItem(new CityDataItem("Tum kaise jaoge?","How will you go?"));
//
//       addItem(new CityDataItem("Ham taxi kar lenge","We will hire a taxi."));
//
//       addItem(new CityDataItem("Kya bat hai?","What is the matter?"));
//
//       addItem(new CityDataItem("Taiyar ho jao.","Get ready/Be ready."));
//
//       addItem(new CityDataItem("Tum kab free ho jaoge?","When will you become free?"));
//
//       addItem(new CityDataItem("Abhi main vyast hu.","Abhi main vyast hu."));
//
//       addItem(new CityDataItem("Kaheen nazar na lage.","Touch wood!"));
//
//       addItem(new CityDataItem("Mene tumhari sifaarish kr di hai.","I have recommended you."));
//
//       addItem(new CityDataItem("Kutte ne use fir kat liya hai.","Dog has bitten him again."));
//
//       addItem(new CityDataItem("Kya dulha doctor hai?","Is the Groom a doctor?"));
//
//       addItem(new CityDataItem("Vo mera bahut kareebi hai.","He is very close to me."));
//
//       addItem(new CityDataItem("Meri baat suno.","Listen to me."));
//
//       addItem(new CityDataItem("bachchon ko tang mat karo","Don’t tease the children."));
//
//       addItem(new CityDataItem("Kitna badal gaya yar tu.","How changed you are!"));
//
//       addItem(new CityDataItem("Muje tyohar pasand hai.","I love festivals."));
//
//       addItem(new CityDataItem("Baraat abhi nahi ayi.","Baraat hasn’t come yet."));
//
//       addItem(new CityDataItem("Pagal ho gaya hai kya tu?","Are you mad or what?"));
//
//       addItem(new CityDataItem("dhyanapurvak suno","Listen carefully."));
//
//       addItem(new CityDataItem("pharsh saaf karo","Clean the floor."));
//
//       addItem(new CityDataItem("apni kameez utaar do","Take off your shirt."));
//
//       addItem(new CityDataItem("School ka programme khatam ho chukka hai.","School function is over."));
//
//       addItem(new CityDataItem("apni kameez pahan lo.","Put on your shirt."));
//
//       addItem(new CityDataItem("Use pahale bolne do.","Let him speak first."));
//
//       addItem(new CityDataItem("turant taiyar ho jao","Be ready at once"));
//
//       addItem(new CityDataItem("Aage se dhyan rakhna.","Keep in mind from now."));
//
//       addItem(new CityDataItem("bahut der ho gai hai","It’s very late."));
//
//       addItem(new CityDataItem("apane daant saaf karo","Clean your teeth."));
//
//       addItem(new CityDataItem("kya aapke hosh thikane hain?","Are you in your senses?"));
//
//       addItem(new CityDataItem("Yah ek zarurat ban gayi hai.","It has become a necessity."));
//
//       addItem(new CityDataItem("Wo ajeeb tha.","He was awkward."));
//
//       addItem(new CityDataItem("Yah kaisa kam karta hai?","How does it work?"));
//
//       addItem(new CityDataItem("Use apne aap sikhna hoga.","He’ll have to learn himself."));
//
//       addItem(new CityDataItem("October tyoharon ka mahina hai.","October is a month of festivals."));
//
//       addItem(new CityDataItem("Aur kuch hai aapke paas?","Anything else do you’ve?"));
//
//       addItem(new CityDataItem("Savdhan raho.","Be careful"));
//
//       addItem(new CityDataItem("Be careful","He slipped and fell down."));
//
//       addItem(new CityDataItem("Vah kuyein me fisal kar gir gaya.","He slipped and fell into the well."));
//
//       addItem(new CityDataItem("Zubaan fisal gai.","It was a slip of tongue."));
//
//       addItem(new CityDataItem("Mom ghar par hain.","Mom is at home."));
//
//       addItem(new CityDataItem("Mammi ghar par hi hain.","Mom is very much at home."));
//
//       addItem(new CityDataItem("Vo thand se kanp raha tha.","He was shivering with cold."));
//
//       addItem(new CityDataItem("Main class mein second aata hun.","I stand second in class."));
//
//       addItem(new CityDataItem("Main vo hun jo aapke sath tha.","I am the one, who was with you."));
//
//       addItem(new CityDataItem("Main apne bachche ko nahla raha hun.","I am giving a bath to my son."));
//
//       addItem(new CityDataItem("Maine anjane mein tumhara dil dukhaya.","I hurt you unknowingly."));
//
//       addItem(new CityDataItem("Aapne janbujh kar mera dil dukhaya.","You knowingly hurt me."));
//
//       addItem(new CityDataItem("Rasoi se ek glass le ke aao.","Bring a glass from the kitchen."));
//
//       addItem(new CityDataItem("Upar ke room se bottle le ke aao. ","Bring the bottle from the room upstairs."));
//
//       addItem(new CityDataItem("Mera man ho raha h ki me khana kha lu.","I am feeling like eating the food."));
//
//       addItem(new CityDataItem("Mera man ho raha hai ki me naha lu.","I am feeling like taking a bath."));
//
//       addItem(new CityDataItem("vo to apni publicity karega hi.","He will obviously do his publicity."));
//
//       addItem(new CityDataItem("Main English bolte bolte atak jata hu.","I fumble while speaking English."));
//
//       addItem(new CityDataItem("Isme mera koi haath nahi hai.","I am not involved in this."));
//
//       addItem(new CityDataItem("Mai roz English sikhne ki koshish krta hu.","I try to learn English every day."));
//
//       addItem(new CityDataItem("Seema bachche ko khila (play) rahi thi.","Seema was making the kid play."));
//
//       addItem(new CityDataItem("Aisa Rahul ke saath hi kyo hota hai?","Why does it happen only with Rahul?"));
//
//       addItem(new CityDataItem("Tumne ye kahaa se uthayi thi?","Where had you picked it from?"));
//
//       addItem(new CityDataItem("Mujhse golmol baate mat kro.","Don’t talk clever with me."));
//
//       addItem(new CityDataItem("Vo mujhe ghar ki dehliz paar nahi krne dega.","He will not let me enter the threshold of the house."));
//
//       addItem(new CityDataItem("Suryanamskar kar lo or paani de do","Greet the Sun and offer the water."));
//
//       addItem(new CityDataItem("Charger ko plug mein laga do","Plug the charger please."));
//
//       addItem(new CityDataItem("Mujhe 5 rupaye vali toffe dedo","Please give me the toffee of Rs. 5 each."));
//
//       addItem(new CityDataItem("Kaash mai vahaan hota.","I wish, I were there."));
//
//       addItem(new CityDataItem("Ye main hi hun.","This is really me."));
//
//       addItem(new CityDataItem("Kya vah main hi hun?","Is that really me?"));
//
//       addItem(new CityDataItem("Kya vah main hi hun?","Is that really me?"));
//
//       addItem(new CityDataItem("Usne hi to ye kaha tha.","It was he, who had said it."));
//
//       addItem(new CityDataItem("Ram hi to yahaan aaya tha.","It was Ram, who had come here."));
//
//       addItem(new CityDataItem("Usne mujhe mara tha vo bhi lathi se","He had beaten me, that too with a stick."));
//
//       addItem(new CityDataItem("Aise mein ham kahan ja sakte hai","Where can we go in this situation?"));
//
//       addItem(new CityDataItem("Hamne aaj baahar dinner kiya.","We took the dinner outside today."));
//
//       addItem(new CityDataItem("Tumhe apni galati maanni chahiye.","You should confess your fault."));
//
//       addItem(new CityDataItem("Main naha raha hun.","I am taking a bath."));
//
//       addItem(new CityDataItem("Main apne bete ko nahla raha hun.","I am giving a bath to my son."));
//
//       addItem(new CityDataItem("Maine apne bete ko nahla raha hun.","I am making my son take a bath."));
//
//       addItem(new CityDataItem("Main apne kutte ko nahla raha hun.","I am giving a bath to my dog."));
//
//       addItem(new CityDataItem("Main padh raha hun.","I am studying"));
//
//       addItem(new CityDataItem("Main paddha raha hun.","I am teaching."));
//
//       addItem(new CityDataItem("Main aapko English paddha raha hun.","I am teaching you English."));
//
//       addItem(new CityDataItem("Main use sula raha hun.","I am making him to sleep."));
//
//       addItem(new CityDataItem("Main hans raha hun.","I am laughing."));
//
//       addItem(new CityDataItem("Main muskura raha hun.","I am smiling."));
//
//       addItem(new CityDataItem("Main apko hasa raha hun","I am making you laugh."));
//
//       addItem(new CityDataItem("Meri vajah se aap muskura rahe hai.","I am making you smile."));
//
//       addItem(new CityDataItem("Main samajh raha hun.","I can understand."));
//
//       addItem(new CityDataItem("Main apko samajha raha hun.","I making you understand."));
//
//       addItem(new CityDataItem("Hum unhe samajha rahe hain.","We are making them understand."));
//
//       addItem(new CityDataItem("Vo ro raha hai.","He is weeping."));
//
//       addItem(new CityDataItem("Vo mujhe rula raha hai.","He is making me weep."));
//
//       addItem(new CityDataItem("Wo bhavuk ho raha hai.","He is being/getting emotional."));
//
//       addItem(new CityDataItem("Wo mujhe bhavuk kar raha hai.","He is making me emotional."));
//
//       addItem(new CityDataItem("Main apko khush kar raha hun.","I am making you happy."));
//
//       addItem(new CityDataItem("Maine apko khush kiya.","I made you happy."));
//
//       addItem(new CityDataItem("I made you happy.","I made you sad."));
//
//       addItem(new CityDataItem("Aap mujhe dukhi kar rahe hain.","You are making me sad."));
//
//       addItem(new CityDataItem("Main khush ho gaya.","I got happy."));
//
//       addItem(new CityDataItem("Main khush ho raha hun.","I am getting happy."));
//
//       addItem(new CityDataItem("Main dukhi ho gaya.","I got sad."));
//
//       addItem(new CityDataItem("Main dukhi ho raha hun.","I am getting sad."));
//
//       addItem(new CityDataItem("Main use khila raha hun.","I am making him eat."));
//
//       addItem(new CityDataItem("Main apako (apne hatho se) khila raha hun.","I am feeding him."));
//
//       addItem(new CityDataItem("Main sabhi ko khila raha hun.","I am serving all."));
//
//       addItem(new CityDataItem("Main sabhi ko khana de raha hun.","I am serving the food to all."));
//
//       addItem(new CityDataItem("Main sabhi ko khana khilava raha hun.","I am getting the food served to all."));
//
//       addItem(new CityDataItem("Main shirt pahan raha hun.","I am wearing the shirt."));
//
//       addItem(new CityDataItem("Main shirt pahna raha hun.","I am making him wear the shirt."));
//
//       addItem(new CityDataItem("Main apne chhote bhai ko shart pahna raha hun.","I am making my younger brother wear the shirt."));
//
//       addItem(new CityDataItem("Main seekh raha hun.","I am learning."));
//
//       addItem(new CityDataItem("Main tumhe sikha raha hun.","I am making you learn."));
//
//       addItem(new CityDataItem("Glass ko ulta kar do.","Turn the glass upside down."));
//
//       addItem(new CityDataItem("Maine book ko ulta kr diya.","I turned the book upside down."));
//
//       addItem(new CityDataItem("Mene glass ko ulta rkh diya","I put / kept the glass upside down."));
//
//       addItem(new CityDataItem("Mene book ko ulta rkh diya","english"));
//
//       addItem(new CityDataItem("Mene shart ulti pahan li.","I put on the shirt inside out."));
//
//       addItem(new CityDataItem("Shart ko sidha kar lo.","Turn the shirt right side out."));
//
//       addItem(new CityDataItem("Usne meri baat ko ulta samajh liya.","He took me otherwise"));
//
//       addItem(new CityDataItem("Ulta maine to vaha bahut mazaa kiya .","I rather enjoyed myself there."));
//
//       addItem(new CityDataItem("Ulta vo mujhe daatne lage.","He rather started scolding me."));
//
//       addItem(new CityDataItem("Ulta ghumo.","Please turn opposite."));
//
//       addItem(new CityDataItem("Usne mere kahe ka ulta kiya.)","He did opposite of what I said."));
//
//       addItem(new CityDataItem("Vo ulta leta hua hai.","He is lying upside down."));
//
//       addItem(new CityDataItem("Main bahut padhta tha taki achchhe number laa pau.","I used to study a lot so as to score good marks."));
//
//       addItem(new CityDataItem("Usne mera saath diya taaki main bhi uska saath du.","He supported me so as to receive my support too."));
//
//       addItem(new CityDataItem("Usne meri baat ko jod tod kar aapke saamne rakha.","He manipulated my words and conveyed to you."));
//
//       addItem(new CityDataItem("Aapne apni income or expenditure ko her fer karke apni performance ko behtar dikhaya hai.","You have manipulated your income and expenditure to show your performance better."));
//
//       addItem(new CityDataItem("Ye aapke bachche ke liye anukool maahol nahi hai.","This is not a conducive environment for your child."));
//
//       addItem(new CityDataItem("Roz exercise karna hamaare mind or body ke liye anukool hai.","To exercise everyday is conducive for our mind & body."));
//
//       addItem(new CityDataItem("Aapka swabhav aur vyavhaar kaafi had tak aapki parvarish par nirbhar karta hai.","Your nature and behavior largely depend on your upbringing."));
//
//       addItem(new CityDataItem("Unka paalan poshan vipreet paristhitiyo me hota hai, yahi unhe majboot bana deta hai.","Their upbringing takes place in adverse circumstances, that’s what makes them strong."));
//
//       addItem(new CityDataItem("Bhool ke bhi company ke niyamo ko mat todna.","Don’t dare to breach company’s rules."));
//
//       addItem(new CityDataItem("Bachcho ko aaspas khelte dekhna tension kam kar deta hai.","Seeing the kids playing around lessens one’s tension."));
//
//       addItem(new CityDataItem("Usne apni mehnat se garibi ko amiri me badal diya.","He changed his adversity into prosperity with his hard work."));
//
//       addItem(new CityDataItem("Vo ek aashavadi insan hai. Uski soch positive hai.","He is an optimistic person. His has a positive thinking."));
//
//       addItem(new CityDataItem("Main apne achchhe bhavishya ke prati aashavadi hu.","I am optimistic to have a bright future."));
//
//       addItem(new CityDataItem("Us aparadhi ke chhoot jaane se har koi hairan tha.","Everyone was shocked with that criminal’s acquittal."));
//
//       addItem(new CityDataItem("Ek nirdosh vyakti ka sajaa se bach nikalna achchhi khabar hai.","Acquittal of an innocent person is good news."));
//
//       addItem(new CityDataItem("Jab aap baahar nikalte hai, tab aapko duniyadari ka pata lagta hai.","When you go out, you get to know about life."));
//
//       addItem(new CityDataItem("Ye kapde nikalkar maine apna bag halka kar diya hai.","I’ve lightened my bag by taking these clothes out."));
//
//       addItem(new CityDataItem("Is bulb se usne apne kamre me ujala kar diya.","He lightened his room with this bulb."));
//
//       addItem(new CityDataItem("Tumhara support use bure daur me majboot banata hai.","Your support strengthens him in adverse situations."));
//
//       addItem(new CityDataItem("Ameeri dost banati hai aur garibi unhe parakhti hai.","Prosperity gains friends and adversity tries them."));
//
//       addItem(new CityDataItem("Samridhi ka matlab hai paisa aur property.","Prosperity means to have money and property."));
//
//       addItem(new CityDataItem("Vo ek nirashavadi insan hai. Uski soch negative hai.","He is a pessimistic person. He has a negative thinking."));
//
//       addItem(new CityDataItem("Ye makaan 2002 me sarkar ke dwara apne kabze me liya gaya tha.","This house had been acquired by the government in 2002."));
//
//       addItem(new CityDataItem("Main aapse milne ka besabri se intzaar kar raha hu.","I am looking forward to meeting you."));
//
//       addItem(new CityDataItem("Aap is property ko kharidne ki umeed kar sakte hai.","You can look forward to buying this property."));
//
//       addItem(new CityDataItem("Maana aapke paas paise na ho. Ab aap kya karoge?","For instance, you have no money. What would you do now?"));
//
//       addItem(new CityDataItem("Maana vaha koi na ho, aise main aap dar jaoge.","For instance, there is no one. You’d be scared then."));
//
//       addItem(new CityDataItem("Jab aap baahar nikalte hai, tab aapko duniyadari ka pata lagta hai.","When you go out, you come to know about life."));
//
//       addItem(new CityDataItem("Main roz daudne jaata hu. Jiski vajah se, mujhme achchha stamina hai.","I go for running every day. As a corollary to that, I have good stamina."));
//
//       addItem(new CityDataItem("Vo achchhi padhai karta hai. Isiliye, usne pahli hi baar me exam paas kar liya","He studies well. As a corollary to that, he passed the exam in first attempt."));
//
//       addItem(new CityDataItem("Is vasiyat ke anusaar, is paitrik sampatti par aapka kaanooni hak hai.","As per this will, you have legal rights on this ancestral property."));
//
//       addItem(new CityDataItem("Aapke jabardast support ke liye bahut bahut dhanyawad.","Thank you so much for your incredible support."));
//
//       addItem(new CityDataItem("Mere nazariye me is property ke rate tezi se badhenge.","In my perspective, the rate of this property will increase quickly."));
//
//       addItem(new CityDataItem("Cheezo ko dekhne ka aapka nazariya/drishtikon aas paas ke mahaul par nirbhar karta hai.","Your perspective to see things depends on your surroundings."));
//
//       addItem(new CityDataItem("Main is pen ke liye kewal Rs. 50 ki boli laga sakta hu. Isse zyada nahi!","I can only bid Rs. 50 for this pen. No higher than this!"));
//
//       addItem(new CityDataItem("Union ne hartal ke maadhyam se company ke faisle ka virodh karne ki dhamki di.","The union threatened to retaliate the company’s decision by calling a strike."));
//
//       addItem(new CityDataItem("Match fixing ke parinaam swaroop ek committee banaayi gayi.","A committee was formed in the wake of the match fixing."));
//
//       addItem(new CityDataItem("Mazdooro ke hiton ko maddenazar rakhte hue PM ne ye faisla liya.","The PM made this decision in the wake of workers’ welfare."));
//
//       addItem(new CityDataItem("Uska lakshya garibi ko jad se ukhad fekna hai.","His ambition is to eradicate poverty."));
//
//       addItem(new CityDataItem("Keval ek expert hi aapki pratibha ka aankalan kar sakta hai.","Only an expert can assess your talent."));
//
//       addItem(new CityDataItem("Gandagi wali jagaho me paani peena jokhim bhara hai.","To drink water at non hygienic places is a health hazard."));
//
//       addItem(new CityDataItem("Zarurat se zyada iska prayog vaatavaran ke liye thik nahi hai.","Its excessive use is an environmental hazard."));
//
//       addItem(new CityDataItem("Tumhare prati uske pyar ki sachchai par hum shak nahi kar sakte.","We can’t doubt the veracity of his feelings for you."));
//
//       addItem(new CityDataItem("Apne jo aarop lagaye hain, usme kitni sachchai hai, saabit karo.","Prove the veracity of your allegations."));
//
//       addItem(new CityDataItem("Pahle ye pakka kar lo ki koi aaspaas to nahi hai.","First you ensure that no one is around."));
//
//       addItem(new CityDataItem("Main sunishchit kar lunga ki mujhe roz class me upasthit rahna hai.","I will ensure to attend the class every day."));
//
//       addItem(new CityDataItem("Uske baalo ko style aksar bahut khoobsurat hota hai.","Her hair style is often very elegant."));
//
//       addItem(new CityDataItem("Main apni pratibha se sabko chaunka sakta hu.","I can astound every one with my talent."));
//
//       addItem(new CityDataItem("Andhere me uske achanak saamne aa jaane se main buri tarah dar gaya.","His sudden appearance in dark astounded me badly."));
//
//       addItem(new CityDataItem("Bulldozer ne 1 ghante me poori building ko dharashayi kar diya.","The bulldozer demolished the whole building within an hour."));
//
//       addItem(new CityDataItem("Nayi factory banane ke khatir uski purani factory ko tod diya gaya.","His old factory was demolished so as to build a new one."));
//
//       addItem(new CityDataItem("Aapke khilaf shadyantra ko unhone ujaagar kiya.","They unearthed the conspiracy against you."));
//
//       addItem(new CityDataItem("1998 me likha gaya ek letter is file se nikala gaya.","A letter, written in 1998 was unearthed from this file."));
//
//       addItem(new CityDataItem("Kewal hamara shareer khatm hota hai. Aatma amar hai.","Only our body dies. Soul is immortal."));
//
//       addItem(new CityDataItem("Sab kuch samay ke sath khatm ho jayega. Kuch bhi amar nahi hai.","Everything will perish with time. Nothing is immortal."));
//
//       addItem(new CityDataItem("Usne apne achchhe karmo se apni chhavi ko badhaya.","He cultivated his image with his good deeds."));
//
//       addItem(new CityDataItem("Is topic ko us video me vistaar se bataaya gaya hai.","This topic has been covered in that video extensively."));
//
//       addItem(new CityDataItem("Is gaaon me aalo ki paidavaar bade paimane par ki jaati hai.","Potato is cultivated extensively in this village."));
//
//       addItem(new CityDataItem("Mene uski aawaaz me todi ghabraahat mahsus ki.","I felt some anxiety in her voice."));
//
//       addItem(new CityDataItem("Jitna main Everest ke paas pahuncha, meri ghabrahat bardhti gayi.","As I reached closer to the Everest, my anxiety increased."));
//
//       addItem(new CityDataItem("Use sataaya gaya taki vo ukse or koi galati kar baithe.","He was persecuted so as to provoke him and make him commit a mistake."));
//
//       addItem(new CityDataItem("Jaanvar tab tak nahi maarte jab tak unhe uksaya na jaaye.","The animals don’t attack unless provoked."));
//
//       addItem(new CityDataItem("Bhookamp ne khidkiyon ko hila kar rakh diya.","The earthquake caused the windows to rattle."));
//
//       addItem(new CityDataItem("Gusse me hone par usne band darwaaze ko khadkhad karna shuru kar diya.","Being angry, he started rattling the locked door."));
//
//       addItem(new CityDataItem("Aapko faisla lete waqt nishpaksh hona zaroori hai.","You must be impartial while making a decision."));
//
//       addItem(new CityDataItem("Ye nishpaksh ravaiya nahi hai. Aapne use 100 rupay diye, or mujhe kewal 10 rupay.","This is not an impartial treatment. You gave him Rs. 100, and to me just Rs.10."));
//
//       addItem(new CityDataItem("Iski khushboo bahut pyari thi and wo pure din rahi.","Its fragrance was very pleasant and lasted all day."));
//
//       addItem(new CityDataItem("Is ped ke hone se hamesha khushboo bani rahti hai.","The presence of this tree guarantees sweet fragrance all the time."));
//
//       addItem(new CityDataItem("Company shuruwaat se hi aage badhne ke liye prayas kiye ja rahi hai.","The company has been striving to grow since its inception."));
//
//       addItem(new CityDataItem("Main hamesha kuch achchha karne ka prayas karta hu.","I always strive to do something better."));
//
//       addItem(new CityDataItem("Main chikni mitti ki moortiyaan banata hu. Log mujhe kumhar kahte hai.","I make clay sculptures. People call me potter."));
//
//       addItem(new CityDataItem("Moortiyon ko aam taur par lakdi, plastic, chikni mitti ya kisi dhaatu se banaya jaata hai.","Sculptures are generally made of wood, plastic, clay or some metal."));
//
//       addItem(new CityDataItem("Ek prerna dene wala bhaasan kisi ki bhi nirasha ko ummeed me badal sakta hai.","A motivational speech can turn one’s despair into hope."));
//
//       addItem(new CityDataItem("Uski aawaz me nirasha thi, shayad isliye ki wo exam me fail ho gaya.","His voice had a feeling of despair, maybe because he failed the exam."));
//
//       addItem(new CityDataItem("Usne mujhe wahaan se nikal jaane ka ishaara kiya.","He gestured to me for going from there."));
//
//       addItem(new CityDataItem("Ye is baat ka sanket deta hai ki hamare beech kitna pyar hai.","It gestures how we love each other."));
//
//       addItem(new CityDataItem("Mujhe bahut bura mahsus hua. Shayad maine uske saath galat kiya.","I felt a pang of guilt. I think I did wrong to him."));
//
//       addItem(new CityDataItem("Maata pita se alag rahna akelepan ka ahsas dilata hai.","Being away from parents produces a pang of loneliness."));
//
//       addItem(new CityDataItem("Chakaachundha kar dene wali light aisa kar deti hai ki thodi der ke liye kuch dikhta nahi hai.","A dazzling light makes one’s eyes unable to see for a while."));
//
//       addItem(new CityDataItem("Uski muskuraahat gazab ki thi or uski personality bhi.","He had a dazzling smile and a superb personality as well."));
//
//       addItem(new CityDataItem("Raja ne nirdosh logo par atyachaar kiya.","The king persecuted the innocent people."));
//
//       addItem(new CityDataItem("Sadak poori tarah barf se dhaki hui thi, lekin humare paas koi vikalp nahi tha bajaay aage badhne ke.","Sadak poori tarah barf se dhaki hui thi, lekin humare paas koi vikalp nahi tha bajaay aage badhne ke."));
//
//       addItem(new CityDataItem("Maine apne bete ko daanta. Usne gussa dikhaya or room se baahar chala gaya.","I scolded my son. He pretended to be angry and trudged out of the room."));
//
//       addItem(new CityDataItem("Internet pe uske credit card ka galat istemal kiye jaane ke case ki police jaanch kar rahi hai.","The police are investigating the case of a fraudulent use of his credit card on internet."));
//
//       addItem(new CityDataItem("Wo apni patni ko dekhkar muskuraya or kaha “chinta mat karo main thik hu.”","He gave his wife a smirk and said “Don’t worry, I’m fine.”"));
//
//       addItem(new CityDataItem("Uski chehre par ek ajeeb si muskurahat thi maano vo mujhe neecha dikha raha ho.","There was a smirk on his face, as if he was looking down on me."));
//
//       addItem(new CityDataItem("Dusro ki baat ko keval sun karke kisi ko badnaam mat kariye.","Don’t calumniate anyone just by listening to what others say."));
//
//       addItem(new CityDataItem("Jab aap dusro ko Badnaam karte hain to aap ki Khud ki chhawi kharaab ho jaati hai.","When you calumniate others, your own image gets spoiled /deteriorated by itself."));
//
//       addItem(new CityDataItem("Mujhe yakeen hai ki CBI ki poori investigation se doshi ka pata chal jaega.","I am sure, that the exhaustive investigation of CBI will reveal the identity of the culprit."));
//
//       addItem(new CityDataItem("Ye puri list nahi hai kuchh or naam abhi aane baaki hain.","It’s not the exhaustive list; few more names are yet to be announced."));
//
//       addItem(new CityDataItem("Kya aap is kitaab mein koi galati nikal sakte hain.","Can you spot any flaw in this book?"));
//
//       addItem(new CityDataItem("Agar aap lagataar mehnat karte rahe, to aap English mein bahut zyada improvement kar sakte hain.","You can have immense improvement in English if you work hard consistently."));
//
//       addItem(new CityDataItem("Vah nadi ke vistaar ko dhyan se dekh rahi thi.","She was gazing at the immense expanse of the river."));
//
//       addItem(new CityDataItem("Usne mere dance ko dayaneey kah kar mera mazaak udaya.","He derided my dancing as pathetic."));
//
//       addItem(new CityDataItem("Meri zindagi dayaneey ho chuki hoti, agar aap mere saath na hote.","My life would have been pathetic, if you hadn’t been with me."));
//
//       addItem(new CityDataItem("Vah mere man mein dabi hui bhaavnaon ko kabhi samajh nahin saka.","He could never understand my pent-up emotions."));
//
//       addItem(new CityDataItem("Mere man mein ek dabi hui ichchha hai ki main apne mata-pita ko duniya ki sair karaun.","I have a pent-up desire to make my parents visit the world."));
//
//       addItem(new CityDataItem("English varnmaala mein Y aakhir se theek pahale aane vala akshar hai.","Y is the penultimate letter in English alphabet."));
//
//       addItem(new CityDataItem("Hafte ke 7 dino mein aakhir se theek pahle aane vala din shanivar hai.","Saturday is the penultimate day of the week."));
//
//       addItem(new CityDataItem("Ye software mere mobile ke anuroop nahi hai.","This software is not compatible to my mobile."));
//
//       addItem(new CityDataItem("Doodh fat gaya hai, ab kheer kaise banau?","The milk has turned sour, how to make rice pudding now?"));
//
//       addItem(new CityDataItem("Jab aap haarte hain to aap zyada seekhte hain, bajay jeetne ke.","You tend to learn more when you lose than when you win."));
//
//       addItem(new CityDataItem("Jab aap budhhe ho jaate  hain, to aap kam sote hain.","When you become old, you tend to sleep less."));
//
//       addItem(new CityDataItem("Tumne kaha tha main hamesha tumhara saath dunga.","You had told me to always stand by me."));
//
//       addItem(new CityDataItem("Kya Abhi Tak tum use Doctor ke pass nahi le gaye ho?","Have you not taken him to a doctor yet?"));
//
//       addItem(new CityDataItem("Ghar se nikla hi tha ki barish shuru ho gayi.","No sooner had I left home, than it started raining."));
//
//       addItem(new CityDataItem("Hamen khushi hai ki aaj ham itne logon tak pahunch chuke hain.","We are happy to reach these many people now."));
//
//       addItem(new CityDataItem("Aisi ghatnaaye mujhe dukhi kar deti hain.","Such incidents sadden me."));
//
//       addItem(new CityDataItem("hame ek doosre ka sath bhata nahi hai.","We are not compatible to each other."));
//
//       addItem(new CityDataItem("Paise ke peeche mat bhago. Paisa aapke peeche bhagega.","Don’t run after money. Money will run after you."));
//
//       addItem(new CityDataItem("Mujhe lagta hai ki taapmaan aaj 100 degree pahunchega.","I expect temperature to approach 100 degrees today."));
//
//       addItem(new CityDataItem("Is meeting ko 1 mahine ke liye taal diya gaya hai.","This meeting has been postponed for a month."));
//
//       addItem(new CityDataItem("Use apni shaadi ki taarikh aage baddhani padi.","He had to postpone his marriage."));
//
//       addItem(new CityDataItem("Hamare boss ne kal ek meeting bulayi thi.","Our boss had convened a meeting yesterday."));
//
//       addItem(new CityDataItem("Is avsar par ek party aayojit ki gayi.","A party was convened on this occasion."));
//
//       addItem(new CityDataItem("Tumhein daanta jata hai.","You are scolded."));
//
//       addItem(new CityDataItem("Humein peeta ja raha tha.","We were being beaten."));
//
//       addItem(new CityDataItem("Mujhe ek kitaab dee jayegee.","I will be given a book."));
//
//       addItem(new CityDataItem("Is puraskaar ke liye keval ek aadmee chuna jata hai.","Only one person is selected for this prize."));
//
//       addItem(new CityDataItem("Mujhe tumhare bare mein bataya gaya hai.","I have been told about you."));
//
//       addItem(new CityDataItem("Bharat ko shantipriya desh ke roop mein jana jata hai.","India is known as a peaceful nation."));
//
//       addItem(new CityDataItem("Kya use bheja gaya?","Was he sent?"));
//
//       addItem(new CityDataItem("Tumhare liye special khana banaya ja raha hai.","A special food is being prepared for you."));
//
//       addItem(new CityDataItem("Unke saath bura bartaav kiya gaya.","They were treated badly."));
//
//       addItem(new CityDataItem("lesson 73 and 9 question","He was known as a great warrior."));
//
//       addItem(new CityDataItem("Ye likha ja chuka hai.","It has been written."));
//
//       addItem(new CityDataItem("Kya use pyar kiya jata hai?","Is he loved?"));
//
//       addItem(new CityDataItem("film ke mega hit hone ki ghoshna ho chuki hai.","The movie has been declared a mega hit."));
//
//       addItem(new CityDataItem("Gang ke mukhiya ko 2:00 baje market mein dekha gaya hai.","The chief of the gang has been seen in the market at 2."));
//
//       addItem(new CityDataItem("Kya unhe is shrarat ke liye daanta gaya?","Were they scolded for this mischief?"));
//
//       addItem(new CityDataItem("Dono doshiyo ki pahchan kee ja chukee hai.","Both the culprits have been identified."));
//
//       addItem(new CityDataItem("Both the culprits have been identified.","Tea is taken every morning."));
//
//       addItem(new CityDataItem("Use kiske saath bheja gaya?","Whom was he sent with?"));
//
//       addItem(new CityDataItem("Use murder ke bare mein kyo nahi pochha jata?","Why is he not asked about the murder?"));
//
//       addItem(new CityDataItem("4 tickten book kar lee gayi hai.","4 Tickets have been booked."));
//
//       addItem(new CityDataItem("Kismat se mujhe vaha bheja gaya aur main tumse mila.","Fortunately, I was sent there and I met you."));
//
//       addItem(new CityDataItem("Mujhe ek adhyapak ke roop me jana jata h.","I am known as a teacher."));
//
//       addItem(new CityDataItem("Bachchon ko bahar bheja gaya.","Children were sent outside."));
//
//       addItem(new CityDataItem("Mujhe iske bare mein soochit nahi kiya gaya.","I was not informed about this."));
//
//       addItem(new CityDataItem("Kitabein chhapee ja rahee hai.","Books are being printed."));
//
//       addItem(new CityDataItem("Is jagah se kuch kursiyaan hataee gai hai.","Few chairs have been moved from this place."));
//
//       addItem(new CityDataItem("Is ilaake mein carey nahi chlai jati.","Cars are not driven in this area."));
//
//       addItem(new CityDataItem("Use kab tak nahi puchha gaya?","Until when was he not asked?"));
//
//       addItem(new CityDataItem("Har jagah mithiyaan batee ja rahee hai.","Sweets are being distributed everywhere."));
//
//       addItem(new CityDataItem("Waha ek building banai ja chuki hai.","A building has been constructed there."));
//
//       addItem(new CityDataItem("Vo police ke dwara pakda gaya.","He was caught by the police."));
//
//       addItem(new CityDataItem("Pyaaz aur aaloo kaphee adhik matra mein kate gaye.","Onions and potatoes were cut in huge quantity."));
//
//       addItem(new CityDataItem("Apradhiyo ko dhoondha ja raha hai.","The criminals are being tracked."));
//
//       addItem(new CityDataItem("Use goli se maar diya gaya.","He was shot dead."));
//
//       addItem(new CityDataItem("Barish ke karan meeting radd kar di gayee.","Meeting was cancelled due to rain."));
//
//       addItem(new CityDataItem("Ghadee theek karaee gayee.","The watch was repaired."));
//
//       addItem(new CityDataItem("Hamein aisa kuch nahi diya gaya hai.","We have not been given anything as such."));
//
//       addItem(new CityDataItem("Hamein vaha faltu mein kyo bheja jata hai?","Why are we unnecessarily sent there?"));
//
//       addItem(new CityDataItem("Mujhe kahi bheja gaya.","I was sent somewhere."));
//
//       addItem(new CityDataItem("Kya tumhe bataya gaya hai ki hum kaha h?","Have you been told where we are?"));
//
//       addItem(new CityDataItem("Pen utha liya gaya hai.","The pen has been picked."));
//
//       addItem(new CityDataItem("Use yah kyo diya gaya?","Why was he given this?"));
//
//       addItem(new CityDataItem("Hamein kya bataya gaya?","What were we told?"));
//
//       addItem(new CityDataItem("Unhein kaha bheja gaya tha?","Where had they been sent?"));
//
//       addItem(new CityDataItem("Use ghaseet kar police station le jaya gaya.","He was dragged to police station."));
//
//       addItem(new CityDataItem("Hame 5th class tak English nahi padhai gayi.","We were not taught English up to 5th class."));
//
//       addItem(new CityDataItem("Is saal keval kuch vidyarthiyo ko lapatop diye gaye.","Only a few students were given laptops this year."));
//
//       addItem(new CityDataItem("Use puchha jana chaahiye tha.","He should have been asked."));
//
//       addItem(new CityDataItem("Hamein bheja jana hai.","We have to be sent."));
//
//       addItem(new CityDataItem("25 pratishat seetein gareeb students ke liye aarakshit hai.","25% seats are reserved for poor students."));
//
//       addItem(new CityDataItem("Insaan ko swarg bheja jata hai agar vo achchhe karm kare.","Human is sent to heaven if he does good deeds."));
//
//       addItem(new CityDataItem("Tumhein bulaya jana tha par nahi bulaya ja saka.","You had to be called but couldn’t be."));
//
//       addItem(new CityDataItem("Ye kaam ho jana chahiye tha.","This work should have been done."));
//
//       addItem(new CityDataItem("Mummy ko puchha jata tha.","Mom used to be asked."));
//
//       addItem(new CityDataItem("Kya Ram ko kitaab dee ja sakti hai?","Can Ram be given the book?"));
//
//       addItem(new CityDataItem("Use kya diya gaya?","What was he given?"));
//
//       addItem(new CityDataItem("Ram ko kiske saath bheja jana chahiye?","With whom should Ram be sent?"));
//
//       addItem(new CityDataItem("Mobile ka prayog kyo hona chahiye?","Why should mobile be used?"));
//
//       addItem(new CityDataItem("Hamein kya padhaya jata tha?","What were we taught?"));
//
//       addItem(new CityDataItem("Mujhe mobile diya ja sakta hai.","I can be given a mobile."));
//
//       addItem(new CityDataItem("Agla prashn kya hona chahiye?","What should be the next question?"));
//
//       addItem(new CityDataItem("Tumhein saja milni chahiye.","You must be punished."));
//
//       addItem(new CityDataItem("Hamein kharch ke liye milne chahiye.","We should be given pocket money."));
//
//       addItem(new CityDataItem("Hamari tankhvah badhai jani hai.","Our salary is to be increased."));
//
//       addItem(new CityDataItem("Usse puchha jana tha.","He had to be asked."));
//
//       addItem(new CityDataItem("Homework jaroor karna chahiye.","Homework must be done."));
//
//       addItem(new CityDataItem("Saare prashn hal kiye ja sakte hai.","All the questions can be solved."));
//
//       addItem(new CityDataItem("Mere saath kisi ko bheja nahi jana chahie.","No one should be sent with me."));
//
//       addItem(new CityDataItem("Use kaha bheja jana chahiye.","Where should he be sent?"));
//
//       addItem(new CityDataItem("Yaha par pen se likha jana hai.","Pen is to be used here."));
//
//       addItem(new CityDataItem("Tumhein ye nahi diya jana.","It’s not be given to you."));
//
//       addItem(new CityDataItem("Ye pani piya nahi ja sakta kyoki yah khara hai.","This water is not drinkable as it is saline."));
//
//       addItem(new CityDataItem("Mujhe padhne nahi diya jata.","I am not let study."));
//
//       addItem(new CityDataItem("ek vidyarthee ko uske sahpathee dwara pratadit kiya gaya.","A student was tortured by his classmate."));
//
//       addItem(new CityDataItem("Diwali khushi se manaee gai.","Diwali was celebrated with joy."));
//
//       addItem(new CityDataItem("Kya tumhein tumhari laparvahee ke liye dand diya jaega?","Will you be punished for your negligence?"));
//
//       addItem(new CityDataItem("Hamein kahi aur bheja ja raha hai.","We are being sent somewhere else."));
//
//       addItem(new CityDataItem("Vo mujhse likhvaata hai.","He makes me write."));
//
//       addItem(new CityDataItem("Vo mujhe bhijvaata hai.","He makes me go."));
//
//       addItem(new CityDataItem("Vo mujhse kaam karvati hai.","She makes me work."));
//
//       addItem(new CityDataItem("Vo mujhse patra likhvatee hai.","She makes me write letters."));
//
//       addItem(new CityDataItem("Vo mujhe bhijva rahi hai.","She is making me go."));
//
//       addItem(new CityDataItem("Vah mujhe bevakuf bana rahi hai.","She is making me fool."));
//
//       addItem(new CityDataItem("Usne mujhe samjhaya.","She made me understand."));
//
//       addItem(new CityDataItem("Main tumse kaam karvaoonga.","I will make you work."));
//
//       addItem(new CityDataItem("Tum mujhe usse ladva rahe ho.","You are making me fight him."));
//
//       addItem(new CityDataItem("Bachche mujhe bevakuf bana rahe hain.","Kids are making me fool."));
//
//       addItem(new CityDataItem("Tum hamein hasate the","You made us laugh."));
//
//       addItem(new CityDataItem("Main tumhein jane de sakta tha.","I could have let you go."));
//
//       addItem(new CityDataItem("Main tumhe khaane ko kuch dilwa skta hu.","I can get you something to eat."));
//
//       addItem(new CityDataItem("Kya tum mujhe exam pass karva skte ho?","Can you make me pass the exam? "));
//
//       addItem(new CityDataItem("Main tumhein pass karva sakta hoon.","I can get you pass."));
//
//       addItem(new CityDataItem("Paisa tumhein pyar nahi dilva sakta.","Money can’t get you love."));
//
//       addItem(new CityDataItem("Tum har kisi ko khush nahi kar sakte.","You can’t make everyone happy."));
//
//       addItem(new CityDataItem("Main tumse nahi khareedva sakta.","I can’t make you purchase."));
//
//       addItem(new CityDataItem("Kya vo use hasa saka?","Could he make her laugh?"));
//
//       addItem(new CityDataItem("Tumhein ye kaam karvaana padega.","You will have to get it done."));
//
//       addItem(new CityDataItem("Vo mujhe burger khilata hai.","He gets me Burger."));
//
//       addItem(new CityDataItem("Vo mujhe acha khana khilata hai.","He gets me good food."));
//
//       addItem(new CityDataItem("Tum mujhe America kab bhijvaoge?","When will you make me go America? "));
//
//       addItem(new CityDataItem("Us bachche ne har kisi ko hasaaya.","That child made everyone laugh."));
//
//       addItem(new CityDataItem("Tumne mujhe rulaya/ rulvaaya hai.","You have made me cry."));
//
//       addItem(new CityDataItem("Vo comedian hai. Vo logo ko hasata hai.","He is a comedian. He makes people laugh."));
//
//       addItem(new CityDataItem("Tum usse apna homework kyo karvate ho?","Why do you make him write your homework?"));
//
//       addItem(new CityDataItem("Usne tumse kise call karvaee?","Whom did he make you call?"));
//
//       addItem(new CityDataItem("Usne ye pen tumhein kaise dilvaya?","How did he get you this pen?"));
//
//       addItem(new CityDataItem("Tumne mujhe pyar ki keemat samjhayee.","You made me understand the value of love."));
//
//       addItem(new CityDataItem("Tum Ram ko usse nahi pitva sakte.","You can’t make him beat Ram."));
//
//       addItem(new CityDataItem("Tum ram se use nahi pitva sakte.","You can’t make Ram beat him."));
//
//       addItem(new CityDataItem("Main tumhein samjha nahi sakta.","I can’t make you understand."));
//
//       addItem(new CityDataItem("Maine tumse baltee bharvai.","I made you fill the bucket."));
//
//       addItem(new CityDataItem("Usne tumse paise kyo kharch karvaye?","Why did he make you spend the money?"));
//
//       addItem(new CityDataItem("Main kya karvata hoon?","What do I get done?"));
//
//       addItem(new CityDataItem("Maine baal katavaye.","I got the hair cut."));
//
//       addItem(new CityDataItem("Kya tum baal katvaoge?","Will you get the hair cut?"));
//
//       addItem(new CityDataItem("(Tumne baal kaha se katvaye?","Where did you get the hair cut from?"));
//
//       addItem(new CityDataItem("Mujhe ye kaam karvana hai.","I have to get it done."));
//
//       addItem(new CityDataItem("Hum Ram se gaana gava sakte hai.","We can make Ram sing the song."));
//
//       addItem(new CityDataItem("Main tumhein kya samjha raha hoon?","What am I making you understand?"));
//
//       addItem(new CityDataItem("Vo mujhse apne 2 batch padhva raha hai.","He is making me teach his 2 batches."));
//
//       addItem(new CityDataItem("Humne use bahar bhijvaya.","We made him go out."));
//
//       addItem(new CityDataItem("Tum ye kisse karvaoge?","Whom will you get this done from?"));
//
//       addItem(new CityDataItem("Tumne mujhse jhooth bulvaya.","You made me tell a lie."));
//
//       addItem(new CityDataItem("Tum kab tak ye kaam khatm karva doge?","By  when will you get this work finished?"));
//
//       addItem(new CityDataItem("Kya tum mujhe dance sikhva sakte ho?","Can you get me learn dance?"));
//
//       addItem(new CityDataItem("Tumne mujhe computer sikhaya","You made me learn computer."));
//
//       addItem(new CityDataItem("Tumne mujhe computer sikhvaya.","You made me learn computer."));
//
//       addItem(new CityDataItem("Usne hamein coke pilaee","He made us drink coke."));
//
//       addItem(new CityDataItem("Tumne mujhe pitvaya.","You got me beaten."));
//
//       addItem(new CityDataItem("Main ye kaam kaise karva sakta hoon?","How can I get this work done?"));
//
//       addItem(new CityDataItem("Humne use bhijvaya par usne vaha kaam nahi kiya.","We made him go but he didn’t work there."));
//
//       addItem(new CityDataItem("Log jabardastee tumhein vaha bhijvayenge.","People will forcefully make you go there."));
//
//       addItem(new CityDataItem("ve tumhen america bhijvayenge basharte tum unhen saabit karo ki tum sabse ache ho.","They will make you go America provided you prove them to be the best."));
//
//       addItem(new CityDataItem("Bobby ne mujhe achchha khana khilaya, jo uski mummy ne pakaya tha.","Bobby made me eat the delicious food, cooked by his mom."));
//
//       addItem(new CityDataItem("Maine har kisi ko us hotel mein khana khilvaya.","I made everyone have food in that hotel."));
//
//       addItem(new CityDataItem("Use mujhe ahsaas dilvaana hoga ki vo sabse acha hai.","He will have to make me realize that he is the best."));
//
//       addItem(new CityDataItem("Mere papa ne mujhe mahsoos karvaaya ki hamein jarurat mandon ki madad karni chaahiye.","My father made me realize that we should help needy people."));
//
//       addItem(new CityDataItem("Main tumse gavaa nahi sakta kyoki tumhari awaaz sureelee nahi hai.","I can’t make you sing as your voice is not fine."));
//
//       addItem(new CityDataItem("Insaaniyat naam ki bhi koi cheez hoti hai","There is something called humanity too."));
//
//       addItem(new CityDataItem("Mera kapda sikud gaya hai","My cloth has shrunk."));
//
//       addItem(new CityDataItem("Maine ek baar mein 2 got daali carrom khel mein","I potted 2 pieces in one go in carrom."));
//
//       addItem(new CityDataItem("Shutter ko upar dhakelo","Push the shutter upwards."));
//
//       addItem(new CityDataItem("Baalti mein paani bhar do nal se","Fill the bucket with water using the tap."));
//
//       addItem(new CityDataItem("Baat ko hansi mein mat udao.","Don’t laugh away the matter."));
//
//       addItem(new CityDataItem("Dhakkan laga do.","Please put the lid back."));
//
//       addItem(new CityDataItem("shakl par mat jao sirat par jao .","Don’t judge by face but virtues."));
//
//       addItem(new CityDataItem("Uski shakl par mat jao vah masoom nahi hai","Don’t judge him by his face, he is not innocent."));
//
//       addItem(new CityDataItem("Meri hansi chhoot gayi","I couldn’t hold laughing."));
//
//       addItem(new CityDataItem("Maine use apni bike par ghumaya","I made her visit the city on my bike."));
//
//       addItem(new CityDataItem("Main yahaan bahut umeed ke saath aaya hu","I have come here with lots of hope."));
//
//       addItem(new CityDataItem("Aaj main vahaan jaane ki sthiti mein nahi hu","I am not in position to go there today."));
//
//       addItem(new CityDataItem("Tum mera kuchh nahi bigaad sakte","You can’t do anything wrong to me."));
//
//       addItem(new CityDataItem("Mera ek ek minute lakh ke barabar hai","My time is extremely precious."));
//
//       addItem(new CityDataItem("Mere haath ki chamadi sikud gayi","The skin of my hands is wrinkled."));
//
//       addItem(new CityDataItem("Uske chakkar mein mat pado","Don’t rely on him."));
//
//       addItem(new CityDataItem("Main usko pakdne ke chakkar mein hu","I am planning to catch him."));
//
//       addItem(new CityDataItem("Uski gardan shareer se alag thi","His head was away off the body."));
//
//       addItem(new CityDataItem("Ye kati hui patang maine luti hai","I caught this cut kite."));
//
//       addItem(new CityDataItem("Aapne mujhe bulaya?","Have you called me?"));
//
//       addItem(new CityDataItem("Vah mujhe peetne ke chakkar me yaha aya.","He came here to beat me."));
//
//       addItem(new CityDataItem("Kya maine tumhara paksh nahi liya?","Did I not favour you?"));
//
//       addItem(new CityDataItem("Agar ye fake nikla to mujhse bura koi nahi hoga","If it is found fake, I will not spare you."));
//
//       addItem(new CityDataItem("Ham har roz nayi cheeje seekhte hai.","We learn new things every day."));
//
//       addItem(new CityDataItem("Uski stithi kharab ho rahi hai.","Her condition is worsening."));
//
//       addItem(new CityDataItem("Wah khidki khulne ka intezar kar raha hai.","He is waiting for the window to open."));
//
//       addItem(new CityDataItem("Tum ekdam thik bol rahe ho.","You are absolutely right."));
//
//       addItem(new CityDataItem("Usne jhuton ko saja di.","He punished the liars."));
//
//       addItem(new CityDataItem("Ap isko ek taraf rakho.","Please keep it aside."));
//
//       addItem(new CityDataItem("Mujhe aksar vahaan jaana hota hai","I have to often go there."));
//
//       addItem(new CityDataItem("Sansaar me gyan ki kami nahi hai.","There is no dearth of knowledge in this world."));
//
//       addItem(new CityDataItem("main apke sath dance karna chahunga.","I would like to dance with you."));
//
//       addItem(new CityDataItem("main apke sath baithna chahunga.","I would like to sit with you."));
//
//       addItem(new CityDataItem("main apke sath bat nahin karna chahunga.","I would not like to talk to you."));
//
//       addItem(new CityDataItem("kya ap mujhse bat karna chahenge?","Would you like to talk to me?"));
//
//       addItem(new CityDataItem("kya ap mujhse milna chahenge?","Would you like to meet me?"));
//
//       addItem(new CityDataItem("ap mujhse kahan milna chahenge?","Where would you like to meet me?"));
//
//       addItem(new CityDataItem("aap kya khana chahenge?","What would you like to eat?"));
//
//       addItem(new CityDataItem("aap kya karna chahenge?","What would you like to do?"));
//
//       addItem(new CityDataItem("kaise aana hua ?","What brings you here?"));
//
//       addItem(new CityDataItem("main zuban ka pakka hun.","I am a person of words."));
//
//       addItem(new CityDataItem("main bahut kharch karata hun.","I am a spendthrift"));
//
//       addItem(new CityDataItem("mujhe aajakal paise ki dikkat hai.","I have financial problem these days."));
//
//       addItem(new CityDataItem("usaki ek aankh kharab hai.","He is blind of one eye."));
//
//       addItem(new CityDataItem("ye ek achchha bahana hai.","This is a good excuse."));
//
//       addItem(new CityDataItem("vo bahut batuni hai.","She is very talkactive."));
//
//       addItem(new CityDataItem("tum mere hamnam ho.","You are my namesake."));
//
//       addItem(new CityDataItem("tumne kaha tha tum hamesha mera saath doga.","You had told me, you will always stand by me."));
//
//       addItem(new CityDataItem("kya main vajah jaan sakata hun?","May I know the reason?"));
//
//       addItem(new CityDataItem("tumane use galat samajha.","You misunderstood him."));
//
//       addItem(new CityDataItem("vo sare din khali tha.","He was idle all the time. "));
//
//       addItem(new CityDataItem(" mera chhota bhai apani marzi ka malik hai.","My younger brother has his own ways."));
//
//       addItem(new CityDataItem("main apane man ki karata hun.","I have my own ways."));
//
//       addItem(new CityDataItem("mere hath mein dard tha.","I had a pain in my hand. "));
//
//       addItem(new CityDataItem("kya isase koi phark padata hai ?","Does it make any difference?"));
//
//       addItem(new CityDataItem("kya isase koi phark padata hai?","Does it make any difference?"));
//
//       addItem(new CityDataItem("tumhe delhi  kaisi lagi?","How did you find/like Delhi?"));
//
//       addItem(new CityDataItem("main shahar se bahar tha.","I was out of station."));
//
//       addItem(new CityDataItem("mere paas car hai.","I have got a car."));
//
//       addItem(new CityDataItem("usake paas  computer hai.","He has got a computer."));
//
//       addItem(new CityDataItem("chhod na.","Leave it."));
//
//       addItem(new CityDataItem(" ya bat khatm karo.","Leave it."));
//
//       addItem(new CityDataItem(" ya bhul jao.","Leave it."));
//
//       addItem(new CityDataItem("usaki tabiyat thik nahi hai. ","He is suffering from an ailment."));
//
//       addItem(new CityDataItem("kal mera eksident (durghatana) ho gaya.","I met with an accident yesterday."));
//
//       addItem(new CityDataItem("tumane mujhe ek rupaye zyada de diya hai.","You have given me a rupee extra."));
//
//       addItem(new CityDataItem("ye kapada ghatiya quality ka hai.","This cloth is of inferior quality."));
//
//       addItem(new CityDataItem("asaman badalon se ghira hua hai.","The sky is full of clouds."));
//
//       addItem(new CityDataItem("tum apani umr se kam lagate ho.","You look younger than your age."));
//
//       addItem(new CityDataItem("vo apani umr se zyada lagata hai.","He looks older than his age."));
//
//       addItem(new CityDataItem("mujhe nind aa rahi hai. ","I am feeling sleepy."));
//
//       addItem(new CityDataItem("mujhe bhukh lag rahi hai.","I am feeling appetite."));
//
//       addItem(new CityDataItem("mujhe bukhar sa lag raha hai.","I am feeling feverish. "));
//
//       addItem(new CityDataItem("tumhe apane aap par sharm ani chahie.","You should be ashamed of yourself."));
//
//       addItem(new CityDataItem("aapaki  padhai kaisi  chal rahi  hai ?","How is your study going on?"));
//
//       addItem(new CityDataItem("usake dimag mein kya chal raha hai ? ","What is going on in his mind?"));
//
//       addItem(new CityDataItem("vahan kya chal raha hai ?","What is going on there?"));
//
//       addItem(new CityDataItem("kya vahan kuchh chal raha hai ?","Is something going on there?"));
//
//       addItem(new CityDataItem("vo mere dilo dimag par bas gayi hai.","She has got on to my heart and soul."));
//
//       addItem(new CityDataItem("yah aam rasta nahin hai.","This is not a thoroughfare."));
//
//       addItem(new CityDataItem("ye charcha mein hai.","It is in talk."));
//
//       addItem(new CityDataItem("vo ek kukhyat vyakti hai.","He is a notorious person."));
//
//       addItem(new CityDataItem("Road repairing ki vajah se band hai.","The road is closed for repairs."));
//
//       addItem(new CityDataItem("mobile repairing ke lie uske paas tha.","The mobile was with him for repairs."));
//
//       addItem(new CityDataItem("yah ek afwah hai","This is a rumour."));
//
//       addItem(new CityDataItem("doshi  kon hai ?","Who is to blame? "));
//
//       addItem(new CityDataItem("tum jan lagakar chilla rahe the.","You were shouting at the top of your voice."));
//
//       addItem(new CityDataItem("ye pain dhadalle se bik rahe hain.","These pens are selling like anything. "));
//
//       addItem(new CityDataItem("kya tum sahi  ho ?","Are you in the right?"));
//
//       addItem(new CityDataItem("kya tum dayin taraf  ho ?","Are you on the right?"));
//
//       addItem(new CityDataItem("kya tum galat ho ?","Are you in the wrong?"));
//
//       addItem(new CityDataItem("kya tum bayin taraf ho ?","Are you on the left?"));
//
//       addItem(new CityDataItem("kya tum hosh mein ho ?","Are you in your senses?"));
//
//       addItem(new CityDataItem("kya tum mujhase darate ho ?","Are you scared of me?"));
//
//       addItem(new CityDataItem("mujhe sirdard ho raha tha.","I had a headache."));
//
//       addItem(new CityDataItem("main ekad mahine mein aa jaunga.","I will come in a month or so."));
//
//       addItem(new CityDataItem("ve ekad sal mein landan jayenge.","They will go London in a year or so."));
//
//       addItem(new CityDataItem("vo ekad din mein aayenge.","He will come in a day or so."));
//
//       addItem(new CityDataItem("mera pet dard ho raha tha.","I had a stomachache."));
//
//       addItem(new CityDataItem("mera pair dard ho raha tha.","I had a pain in my leg."));
//
//       addItem(new CityDataItem("andhera ho raha hai.","It is getting dark."));
//
//       addItem(new CityDataItem("lamp mein tel nahin hai.","The lamp has no oil."));
//
//       addItem(new CityDataItem("hamare desh mein anaj ki kami nahin hai.","There is no shortage of food grains in our country."));
//
//       addItem(new CityDataItem("ek kahavat hai, asambhav kuchh bhi nahi।","There is a saying that ‘nothing is impossible’."));
//
//       addItem(new CityDataItem("is pareshani se chhutakara paane ka kya koi tareeka hai ?","Is there a way to get out of this problem?"));
//
//       addItem(new CityDataItem("ye rahi aapaki ghadi.","Here is your watch."));
//
//       addItem(new CityDataItem("ye leejie aapaki ghadi.","Here is your watch."));
//
//       addItem(new CityDataItem("ye lijie paise.","Here is the money."));
//
//       addItem(new CityDataItem("ye rahe paise. ","Here is the money."));
//
//       addItem(new CityDataItem("ye lijie pain.","Here is the pen."));
//
//       addItem(new CityDataItem("lo, teachar aa gaye.","Here comes the teacher."));
//
//       addItem(new CityDataItem("lo, rohit aa gaya .","Here comes Rohit."));
//
//       addItem(new CityDataItem("lejie, aap aa gaye.","Here comes you."));
//
//       addItem(new CityDataItem("ye lo, main aa gaya .","Here comes I"));
//
//       addItem(new CityDataItem("tum kab se yahan ho ?","Since when have you been here?"));
//
//       addItem(new CityDataItem("ye mere kabu se bahar hai.","This is out of my control/hands."));
//
//       addItem(new CityDataItem("ghar jal raha hai.","The house is on fire."));
//
//       addItem(new CityDataItem("bhagavan ka aashirvad hamesha tumhare saath hai.","God’s grace is always with you."));
//
//       addItem(new CityDataItem("dusaro ki  nakal mat karo.","Don’t copy others."));
//
//       addItem(new CityDataItem("pensil se mat likho.","Don’t write with a pencil."));
//
//       addItem(new CityDataItem("aag jail rahane do.","Keep the fire on."));
//
//       addItem(new CityDataItem("hamen buri  aadaten chhod deni  chaahie.","We should give up bad habits."));
//
//       addItem(new CityDataItem("khana achchhi  tarah chabao.","Chew the food well."));
//
//       addItem(new CityDataItem("naak saph karo.","Blow your nose."));
//
//       addItem(new CityDataItem("kot ke batan band karo. ","Button up the coat."));
//
//       addItem(new CityDataItem("is mobail ko dono hathon se pakado","Hold this mobile with both hands."));
//
//       addItem(new CityDataItem("pura din main ram ka intazar kar raha tha.","All the while I was waiting for Ram."));
//
//       addItem(new CityDataItem("main thodi der baad aaunga.","I will come after a while."));
//
//       addItem(new CityDataItem("lagta hai, vo tumhara koi hai.","Looks as, he is someone to you."));
//
//       addItem(new CityDataItem("lagta hai, hamare adhyapak aaj yahan nahi hain.","Looks as, our teacher is not here today."));
//
//       addItem(new CityDataItem("lagta hai, tumhari  tabiyat thइk nahi hai aaj.","Looks as, you are not well today."));
//
//       addItem(new CityDataItem("vo hamesha ki  tarah mere paas aaya.","He came to me as usual."));
//
//       addItem(new CityDataItem("papa ne hamesha ki tarah use danta aur vo ghar se chala gaya.","As usual, Dad scolded him and he left home."));
//
//       addItem(new CityDataItem("chahe jo ho, ham aisa nahin karenge","Come what may, we will not do so."));
//
//       addItem(new CityDataItem("chahe jo ho, main vahan jaunga.","No matter what, I’ll go there."));
//
//       addItem(new CityDataItem("bhagavan jane vo kon hai.","God knows who he is."));
//
//       addItem(new CityDataItem("bhagavan jane ve kahan hain.","God knows where they are."));
//
//       addItem(new CityDataItem("bhagavan jaane ye kisane banaya.","God knows who made this."));
//
//       addItem(new CityDataItem("sardiyaan ane vali hain.","The winters are round the corner."));
//
//       addItem(new CityDataItem("garmiyan ane vali hain","The summers are round the corner."));
//
//       addItem(new CityDataItem("Dad ekad ghante me pahunchane wale h.","Dad is about to reach in an hour or so."));
//
//       addItem(new CityDataItem("main apna samay kat raha hun.","I am whiling away my time"));
//
//       addItem(new CityDataItem("tum kitne saal ke ho?","How old are you?"));
//
//       addItem(new CityDataItem("main ye roz-roz khakar thak gaya hun","I am tired of eating it daily."));
//
//       addItem(new CityDataItem("main tumase pak gaya hun.","I am tired of you. "));
//
//       addItem(new CityDataItem("vo is samay kanapur ke aasapas hoga","He will be hereabouts Kanpur this time."));
//
//       addItem(new CityDataItem("mujhe vishvas hai ki main safal ho jaunga.","I am sure of success."));
//
//       addItem(new CityDataItem("dhyan rakhna tumhen vahan jana hai","Keep in mind that you have to go there. "));
//
//       addItem(new CityDataItem("tumane meri bahut madad ki hai","You have been a great help to me."));
//
//       addItem(new CityDataItem("ham is gift ki ahmiyat ko nahi tol sakte.","We can’t assess the value of this gift."));
//
//       addItem(new CityDataItem("sachin ke andar kriket ki ek ajib si  lalak hai.","Sachin has real flair/interest/taste/passion for cricket."));
//
//       addItem(new CityDataItem("vo bahut dur se aa raha hai.","He is coming from afar."));
//
//       addItem(new CityDataItem("main 18 saal ka ho gaya hun","I have turned 18."));
//
//       addItem(new CityDataItem("vo15 saal ka ho gaya hai.","He has turned 15."));
//
//       addItem(new CityDataItem("maine kadmon ki avaz suni thi","I heard a footfall."));
//
//       addItem(new CityDataItem("vo sare din bahut chup-chup sa laga","He seemed very aloof all the time."));
//
//       addItem(new CityDataItem("mujhe bachchon ka tutlana pasand hai","I like the lisping of children."));
//
//       addItem(new CityDataItem("maine ummid ke mutabik kam nahi kiya","I didn’t work up to the par."));
//
//       addItem(new CityDataItem("yahi kitab to main chahta hun.","This is the very book I want."));
//
//       addItem(new CityDataItem("vo bhai ki maut ki vajah se sadme me thi.","She was in a shock due to her brother’s death."));
//
//       addItem(new CityDataItem("mujhe ye paheli sulajhani hai.","I have to solve this puzzle."));
//
//       addItem(new CityDataItem("main hamesha tumhara saath dunga","I will always stand by you"));
//
//       addItem(new CityDataItem("kya tumne hal hi me use dekha hai?","Have you seen him lately/recently?"));
//
//       addItem(new CityDataItem("Filhal tum yahan intajar karo.","For the time being, you wait here."));
//
//       addItem(new CityDataItem("Filhal main tumhen ye kitaab de raha hun.","I am giving you this book for the time being."));
//
//       addItem(new CityDataItem("Mom aaspas nahin dikh rahi thi","Mom was not seen around."));
//
//       addItem(new CityDataItem("ve aaspas nahi dikh rahe hai.","They are not seen around."));
//
//       addItem(new CityDataItem("chalo tahalate hai.","Let’s stroll. "));
//
//       addItem(new CityDataItem("ye kitaben mere kisi kam ki nahi","These books are of no use to me."));
//
//       addItem(new CityDataItem("India Australia ke viruddh ladkhada raha hai","India is tottering against Australia."));
//
//       addItem(new CityDataItem("kya tum mujh par ek ahasan karoge ?","Will you do me a favor?"));
//
//       addItem(new CityDataItem("maine uske sath kya galat kiya hai?","What wrong have I done to him?"));
//
//       addItem(new CityDataItem("hamare bich batchit nahi hai","We are not in speaking terms."));
//
//       addItem(new CityDataItem("Hum ek dusre ke yahaan aate jaate nahi.","We are not in visiting terms."));
//
//       addItem(new CityDataItem("vahan jana thik nahi hai.","It is not worthwhile going there."));
//
//       addItem(new CityDataItem("tumhen apni galti man leni chahie","You should confess your fault."));
//
//       addItem(new CityDataItem("main tumhen nahi chhodunga","I will not spare you."));
//
//       addItem(new CityDataItem("sach kahun to main bahut khush hun","To be honest, I am very happy."));
//
//       addItem(new CityDataItem("vo zindagi  aur maut ke bich jujh raha hai","He is hovering between life and death."));
//
//       addItem(new CityDataItem("vo behosh ho gaya hai.","He has become unconscious."));
//
//       addItem(new CityDataItem("tumhari shaadi karib aa rahi hai.","Your marriage is drawing near."));
//
//       addItem(new CityDataItem("launching ki tarikh karib aa rahi hai.","The launching date is drawing near."));
//
//       addItem(new CityDataItem("maine apni shart rakhi.","I laid my condition"));
//
//       addItem(new CityDataItem("mujhe paise ki sakht zarurat hai.","I am in a dire need of money."));
//
//       addItem(new CityDataItem("hamen dusaron ka apamaan nahi karana chahie.","We shouldn’t abase/debase/defame others."));
//
//       addItem(new CityDataItem("hamesha ki tarah, yashi meri god mein aayi.","As always, Yashi came to my laps."));
//
//       addItem(new CityDataItem("main tumhe dekhane ke lie tadap raha tha.","I was craving to see you."));
//
//       addItem(new CityDataItem("tumhari jeb me  vo ubhara hua kya hai?","What’s that bulge in your pocket?"));
//
//       addItem(new CityDataItem("samudr mein vo ubhra hua kya hai?","What’s that bulge in the sea? "));
//
//       addItem(new CityDataItem("ghamand mujhe kabhi  chhu nahi sakata.","Arrogance can never caress me."));
//
//       addItem(new CityDataItem("jus ko halke-halke piyo.","Sip the juice slowly."));
//
//       addItem(new CityDataItem("batachit se karibi badhati hai.","Conversation increases the proximity."));
//
//       addItem(new CityDataItem("use naukari se nikal diya gaya hai.","He has been fired/expelled from the job."));
//
//       addItem(new CityDataItem("sabji bechane vala apko lut raha hai.","The vegetable seller is ripping you off."));
//
//       addItem(new CityDataItem("tum uske kaan me kya fusfusa rahe ho?","What are you whispering in his ear?"));
//
//       addItem(new CityDataItem("ham uski harkat par nazar rakhenge.","We will keep a vigil on his activity."));
//
//       addItem(new CityDataItem("ghaav se kon nikal raha hai.","The blood is oozing from the wound."));
//
//       addItem(new CityDataItem("tum khali samay me kya karte ho?","What do you do in your leisure time?"));
//
//       addItem(new CityDataItem("tum ye kitab hamesha ke lie rakh sakate ho.","You can keep this book for keeps."));
//
//       addItem(new CityDataItem("kal rat mujhe bahut gahri nind aayi","I had a sound sleep last night."));
//
//       addItem(new CityDataItem("me kisi ke pichhe bhagna pasand nahi krta.","I don’t like to run after anyone."));
//
//       addItem(new CityDataItem("usne ghav par marham lagaya.","He put ointment on the wound."));
//
//       addItem(new CityDataItem("dahez pratha hamare samaz ke liye ek abhishap hai.","Dowry system is a malediction for our society."));
//
//       addItem(new CityDataItem("aatankavadi hamle suraksha khamiyon ki vajah se hote hain.","Terrorist attacks occur due to the security lapse."));
//
//       addItem(new CityDataItem("main 6 maheene ke bad usaka chehara dekh paya.","I could see his face after a lapse of six months."));
//
//       addItem(new CityDataItem("main koi kasar nahi chhodunga.","I will leave no stone unturned."));
//
//       addItem(new CityDataItem("vo sigret peene ka aadi ho gaya hai","He has been addicted to smoking."));
//
//       addItem(new CityDataItem("isse mera kam chala jayega.","It will serve my purpose. "));
//
//       addItem(new CityDataItem("main bina taiyaari Interview ke lie gaya.","I went for the interview off hand."));
//
//       addItem(new CityDataItem("main jevan ke utaar-chadhav se avagat hun.","I am familiar with the heads and tails of life."));
//
//       addItem(new CityDataItem("hame aapa nahi khona chahiye.","We shouldn’t lose our temper."));
//
//       addItem(new CityDataItem("vo aparadhi abhi bhi pakad se bahar hai.","That criminal is still at large."));
//
//       addItem(new CityDataItem("ye badappan kibaat nahin.","It is not a matter of kindness\n"));
//
//       addItem(new CityDataItem("Mujhe to balki khushi hogi.","It will rather please me."));
//
//       addItem(new CityDataItem("hamare paas bahut samay hai.","We have plenty of time."));
//
//       addItem(new CityDataItem("Bas do minat mein main nikal gaya hota.","I would have left just in 2 mins."));
//
//       addItem(new CityDataItem("yah kranti black money  ka pardafaash kar degi.","This revolution will unearth the black money."));
//
//       addItem(new CityDataItem("main tumhare mamale mein nahi ghusna chahata.","I don’t want to delve into your matter."));
//
//       addItem(new CityDataItem("mere kot ko pahan ke dekho.","Try my coat on."));
//
//       addItem(new CityDataItem("Guests ki khatiradari karo.","Look after the guests."));
//
//       addItem(new CityDataItem("Tumhara kam prashansani hai.","Your work is praiseworthy."));
//
//       addItem(new CityDataItem("hamen apane aap ko chalak nahi samajhana chahie.","We should not think ourselves to be clever."));
//
//       addItem(new CityDataItem("Main apani anumati deta hun.","I give my consent."));
//
//       addItem(new CityDataItem("tumhe meri vajah se pareshani  jhelani padi.","You had to suffer because of me."));
//
//       addItem(new CityDataItem("Is maamle ko kisi tarah sulajhao.","Settle this matter somehow."));
//
//       addItem(new CityDataItem("meri taraph se pleej mafi mang lena.","Please apologize on my behalf."));
//
//       addItem(new CityDataItem("rod durghatana mein kari log ghayal hue.","Many people got injured in the road mishap."));
//
//       addItem(new CityDataItem("usne poori kitab padhi.","He went through the whole book."));
//
//       addItem(new CityDataItem("vo der se uthata hai.","He is a late riser."));
//
//       addItem(new CityDataItem("vo jaldi uthata hai.","He is an early riser."));
//
//       addItem(new CityDataItem("Main Newspaper roz padhata hun.","I go through the newspaper every day."));
//
//       addItem(new CityDataItem("aag bujha do kahin charon or na phail jae.","Put out the fire lest it should spread around."));
//
//       addItem(new CityDataItem("vo subah ki train se utara.","He got off the morning train."));
//
//       addItem(new CityDataItem("usne IAS exam paas kar liya.","He got through the IAS exam."));
//
//       addItem(new CityDataItem("vapis aate hue, main usake ghar gaya.","On the way back I went to his home."));
//
//       addItem(new CityDataItem("main paudhon ko pani  de raha hun.","I am watering the plants."));
//
//       addItem(new CityDataItem("Hamne raaste mein ek ajeeb cheez dekhi.","We saw an awkward thing on the way."));
//
//       addItem(new CityDataItem("Tum mujhe mere jaise hi lagte ho.","You seem to me just like me."));
//
//       addItem(new CityDataItem("Ek samay ki bat hai, ek raja tha.","Once upon a time, there was a king."));
//
//       addItem(new CityDataItem("Main aaj vahan jaane vala hun.","I am supposed to go there today."));
//
//       addItem(new CityDataItem("Main hamesha aapaka aabhari /shukragujar rahunga.","I will remain indebted to you."));
//
//       addItem(new CityDataItem("Mujhe Doctor. samajhne ki galti mat karo.","Don’t mistake me for a Doctor."));
//
//       addItem(new CityDataItem("Usne mujhe Engineer samajhne ki galati ki.","He mistook me for an Engineer."));
//
//       addItem(new CityDataItem("Main tumse puri tarah sahmat nahi hu","I don’t quite agree with you."));
//
//       addItem(new CityDataItem("Ye kapde chhote ho gaye hain.","These clothes are worn out."));
//
//       addItem(new CityDataItem("Yah jaanvar vilupt ho raha hai.","This animal is being extinct."));
//
//       addItem(new CityDataItem("ye kamar tod dene vala kam hai.","This is a backpaining work."));
//
//       addItem(new CityDataItem("mujhe thoda-thoda karake khilao.","Feed me bit by bit."));
//
//       addItem(new CityDataItem("Hamne toss kiya, haid aaya.","We tossed the coin, it came down heads."));
//
//       addItem(new CityDataItem("Hamne tos kiya, tels aaya.","We tossed the coin, it came down tails."));
//
//       addItem(new CityDataItem("mere pas keval 3 chhuttiyan hain.","I have only 3 leaves in my credit."));
//
//       addItem(new CityDataItem("vo meri salah ko nahi manata.","He doesn’t act on my advice."));
//
//       addItem(new CityDataItem("Please thoda aur lejie.","Please have a little more."));
//
//       addItem(new CityDataItem("main apki seva mein haazir hun.","I am at your service."));
//
//       addItem(new CityDataItem("tumhen halke saman ke sath yatra karni chahie.","You should travel light."));
//
//       addItem(new CityDataItem("bhagy ke samne koi nahi tik sakata.","Nobody can stand against fate."));
//
//       addItem(new CityDataItem("Tum garibo par daya nahi karate.","You don’t show pity on the poor."));
//
//       addItem(new CityDataItem("Aaj taptapati garmi hai.","It’s a blistering heat today."));
//
//       addItem(new CityDataItem("Dhyan dejiye.","Please Pay attention"));
//
//       addItem(new CityDataItem("Maaf karen apako kasht hua","Sorry to hurt you."));
//
//       addItem(new CityDataItem("aaram se baithie.","Feel at home."));
//
//       addItem(new CityDataItem("aap mujhe bolne do.","Let me speak."));
//
//       addItem(new CityDataItem("apne ham par bahut krpa ki.","It’s very kind of you."));
//
//       addItem(new CityDataItem("sochane ke lie vakt dejie.","Give me some time to think."));
//
//       addItem(new CityDataItem("aapase milakar khushi hui.","Pleasure to meet you."));
//
//       addItem(new CityDataItem("mujhe maut se dar nahin lagata.","I am not afraid of death."));
//
//       addItem(new CityDataItem("tumhen sharm aani chahie.","You must be ashamed."));
//
//       addItem(new CityDataItem("tumhari aisa karne ki himmat kaise hui !","How dare you do so!"));
//
//       addItem(new CityDataItem("Aapke paas khone ko kuch nahi hai lekin paane ko bahut kuch.","You have nothing to lose but a lot to gain."));
//
//       addItem(new CityDataItem("hamen iske parinamon ke liYe taiyar rahana chahie.","We should be ready for its consequences."));
//
//       addItem(new CityDataItem("mujhe vo log pasand nahi jo igjaims se ek mahine pahale rat lete hain.","I don’t like those guys who cram at the last month before exams."));
//
//       addItem(new CityDataItem("doktar ne use zinda rakhane ki  bahut koshish ki par koi phayada nahi hua.","Doctor tried a lot to keep him alive but of no avail/use."));
//
//       addItem(new CityDataItem("vo apane aap ko usase bat karane se nahi rok saki","She couldn’t hold herself talking to him."));
//
//       addItem(new CityDataItem("vo padhane laga aur aisa dikhaya mano vo kaphi der se padh raha ho.","He started studying and made it look as if he had been studying for a long."));
//
//       addItem(new CityDataItem("Agar vo tumhe paise vaapas na de to?","What if he doesn’t return you the money?"));
//
//       addItem(new CityDataItem("Agar vo tumhe baat na kare to?","What if he doesn’t talk to you?"));
//
//       addItem(new CityDataItem("Mushkil se 10 rupay honge mere wallet me.","There would hardly be Rs. 10 in my wallet."));
//
//       addItem(new CityDataItem("Main is saal shayad hi koi chhutti li hai.","I have hardly taken a leave this year."));
//
//       addItem(new CityDataItem("hiksha insan ko sabhya banaati hai.","Education makes one civilized."));
//
//       addItem(new CityDataItem("Honi ko kaun taal sakta hai!","Who can change the destiny!"));
//
//       addItem(new CityDataItem("Isse kya fark padta hai!","What difference does it make!"));
//
//       addItem(new CityDataItem("Apne dil ko kaise samjhaun?","How do I convince my heart?"));
//
//       addItem(new CityDataItem("tumne kachare ko jalvaya hai","You have got the garbage burnt."));
//
//       addItem(new CityDataItem("Kaash use mere dukh ka ahsas hota.","I wish he had the feel of my pain."));
//
//       addItem(new CityDataItem("Aap me se kitne morning walk pr jaate hai?","How many of you go on a morning walk?"));
//
//       addItem(new CityDataItem("Paisa dena aasaan hai, lena bahut mushkil.","It’s easy to lend money but very difficult to take back."));
//
//       addItem(new CityDataItem("Mere paas kal bhi paise nahi the, aaj bhi nahi hain.","I have never had money."));
//
//       addItem(new CityDataItem("Aaj ke baad mujhe kabhi phone mat karna.","Don’t ever call me again."));
//
//       addItem(new CityDataItem("Kya ho agar vo tumhara dil tod de to?","What if she breaks your heart?"));
//
//       addItem(new CityDataItem("Zindagi hame shaayad doosra mauka na de.","Maybe, life doesn’t give us another chance."));
//
//       addItem(new CityDataItem("usne police ko soochit kar diya.","He reported to police"));
//
//       addItem(new CityDataItem("main is maamle me chashmdeed gawah hun","I am an eye witness in this case."));
//
//       addItem(new CityDataItem("Aparaadhi ko bari kar diya gaya.","The criminal was acquitted."));
//
//       addItem(new CityDataItem("Vo bhi kya din the! Kasam se!","How beautiful the days were! Really!"));
//
//       addItem(new CityDataItem("Aap bhi kya insan ho! Sach me!","How great a person you are! Really!"));
//
//       addItem(new CityDataItem("Kya ho agar vo tumhara dil tod de to?","What if he breaks your heart?"));
//
//       addItem(new CityDataItem("Agar vo aapki baat na maane to?","What if he doesn’t obey you?"));
//
//       addItem(new CityDataItem("Zindagi hame shaayad doosra mauka na de.","Maybe, life doesn’t give us another chance."));
//
//       addItem(new CityDataItem("Vo mujhe shaayad doosra mauka na de.","Maybe, he doesn’t give me another chance."));
//
//       addItem(new CityDataItem("Vo mujhe doosra mauka na de to?","What if he doesn’t give me another chance?"));
//
//       addItem(new CityDataItem("What if he doesn’t give me another chance?","How changed you are!"));
//
//       addItem(new CityDataItem("Samay kitna badal gaya hai.","How changed the time is!"));
//
//       addItem(new CityDataItem("Kaash tum mere hote.","I wish you were mine."));
//
//       addItem(new CityDataItem("Kaash main tumhara hota.","I wish I were yours."));
//
//       addItem(new CityDataItem("Pagal ho gaya hai kya tu?","Are you mad or what?"));
//
//       addItem(new CityDataItem("Ye pen hai ya fir…?","Is it a pen or what?"));
//
//       addItem(new CityDataItem("Jo ho raha hai, hone do.","Let happen, whatever is going on."));
//
//       addItem(new CityDataItem("Yaade aaj bhi dhundli nahi hui hain.","Memories are not yet vanished."));
//
//       addItem(new CityDataItem("Maine bahut koshish ki par sab bekaar","I tried a lot but all in vain."));
//
//       addItem(new CityDataItem("Maine bahut padhai ki par sab bekaar.","I studied a lot but all in vain."));
//
//       addItem(new CityDataItem("Shayd hi kisi ne mujhe dhudne ki koshish ki.","I don’t think if someone tried to look for me."));
//
//       addItem(new CityDataItem("Vo shayad hi kabhi mujhse mil paaye.","I don’t think if he could ever meet me."));
//
//       addItem(new CityDataItem("Main koi kasar nahi chodunga.","I will leave no stone unturned."));
//
//       addItem(new CityDataItem("Aapne chappale ulti pahan rakhi hain.","You have put on your slippers wrong sides."));
//
//       addItem(new CityDataItem("Aapki chappale ulti padi hui hain.","Your slippers are lying upside down."));
//
//       addItem(new CityDataItem("Kaash main ghar jaa pata!","I wish I could go home!"));
//
//       addItem(new CityDataItem("Kaash main aapse mil pata!","I wish I could meet you!"));
//
//       addItem(new CityDataItem("Main ye dil se karna chahta hu.","I want to do it wholeheartedly."));
//
//       addItem(new CityDataItem("Main aapko dil se padhaana chahta hu.","I want to teach you wholeheartedly."));
//
//       addItem(new CityDataItem("Aaj main kisi tarah bach gaya.","I somehow escaped today."));
//
//       addItem(new CityDataItem("Mujhe ye Rs. 10 ka pada.","It cost me Rs. 10."));
//
//       addItem(new CityDataItem("Hamare beech kuch nahi hai.","There is nothing between us."));
//
//       addItem(new CityDataItem("Mene tumhara kya bigada hai?","What wrong have I done to you?"));
//
//       addItem(new CityDataItem("Usne tumhara kya bigada hai?","What wrong has he done to you?"));
//
//       addItem(new CityDataItem("Kisi ne tumhara kya bigada hai?","What wrong has anyone done to you?"));
//
//       addItem(new CityDataItem("Isme tumhara kya bigdega?","What wrong can it cause to you?"));
//
//       addItem(new CityDataItem("vo to tumhara sath dega hi.","He will obviously support you."));
//
//       addItem(new CityDataItem("vo to vaha jayega hi.)","He will obviously go there."));
//
//       addItem(new CityDataItem("Usne hi to ye kaha tha.","It was he, who had said it."));
//
//       addItem(new CityDataItem("Vah fisal kar gir gaya.","He slipped and fell down."));
//
//       addItem(new CityDataItem("Vah kuyein me fisal kar gir gaya.","He slipped and fell into the well."));
//
//       addItem(new CityDataItem("Zubaan fisal gai.","It was a slip of tongue."));
//
//       addItem(new CityDataItem("Tum mere aage nahi tik sakte.","You can’t stand against me."));
//
//       addItem(new CityDataItem("Ye chappale zyada din tak nahi tikegi","These slippers are not going to stay long."));
//
//       addItem(new CityDataItem("us par chori ka ilzam hai","He is accused of theft."));
//
//       addItem(new CityDataItem("us par chori karne ka ilzam hai","He is accused of stealing money."));
//
//       addItem(new CityDataItem("ye aapki meharbani hai","It’s very kind of you."));
//
//       addItem(new CityDataItem("aap vastav mein ek vinamra vyakti hain.","You are indeed a generous person."));
//
//       addItem(new CityDataItem("apani ghadi thik karavao","Get your watch repaired."));
//
//       addItem(new CityDataItem("vah kapade silai kar rahi hai.","She is stitching clothes."));
//
//       addItem(new CityDataItem("ye log aapse milna chahte hain.","These people want to meet you."));
//
//       addItem(new CityDataItem("(uske sir mein dard hai","(uske sir mein dard hai"));
//
//       addItem(new CityDataItem("Main aapka intzaar kar raha hun.","I am waiting for you."));
//
//       addItem(new CityDataItem("Uth jaaiye, saat baj gaye hain.","Please get up, it’s 7 o’clock."));
//
//       addItem(new CityDataItem("yah makaan kiraye ke liye khali hai","This house is to let."));
//
//       addItem(new CityDataItem("ab rogi khatre se baahar hai.","Now the patient is out of danger."));
//
//       addItem(new CityDataItem("Operation theatre kis or hai?","Which way is the operation theatre?"));
//
//       addItem(new CityDataItem("din ba din haalaat kharab ho rahe hai","Things are deteriorating day by day."));
//
//       addItem(new CityDataItem("Mujhe apni sehat ki chinta hai.","I am worried about my health."));
//
//       addItem(new CityDataItem("mera sir chakara raha hai","I am feeling giddy."));
//
//       addItem(new CityDataItem("Aapko main kaise samjhaun?","How do I make you understand?"));
//
//       addItem(new CityDataItem("Shiksha vyavsaay nahi balki aap tak pahunchne ka ek prayas hai.","Education is not a business but an endeavor to reach you."));
//
//       addItem(new CityDataItem("achchha hoga ki isi samay aap apna homework kar lo, varna…","Better you complete your homework right away or else…"));
//
//       addItem(new CityDataItem("achchha hoga ki aap isee samay T.V. band kar do.","Better you switch off the TV right away."));
//
//       addItem(new CityDataItem("us aadami ne jo kiya tha use uske liye saja mili","The man got punished for what he had done."));
//
//       addItem(new CityDataItem("tumhare pitaji mere pitaji se umr mein bade hain.","Your father is older than my father."));
//
//       addItem(new CityDataItem("main janata hun ki ye samasya kis tarah hal ki ja sakti hai.","I know how this problem can be solved."));
//
//       addItem(new CityDataItem("Jab vah khaana kha raha hota hai vah TV dekhata hai","He watches TV while having the food."));
//
//       addItem(new CityDataItem("Jaha tak meri zindagi ka sawal hai, maine ise manav kalyaan par laga diya hai.","As far as my life is concerned, I have devoted it to human welfare."));
//
//       addItem(new CityDataItem("Main tumhari surat nahin dekhana chahata.","I don’t want to even see your face."));
//
//       addItem(new CityDataItem("kya ap mere lie thoda samay nikal sakte hain?","Can you please spare some time for me?"));
//
//   }
//
//    private static void addItem(CityDataItem cityDataItem){
//        cityDataItemList.add(cityDataItem);
//        dataItemMap.put(cityDataItem.getHindi(), cityDataItem);
//    }
//
//}
