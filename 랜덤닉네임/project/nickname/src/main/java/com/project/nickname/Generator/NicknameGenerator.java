package com.project.nickname.Generator;

import java.util.List;
import java.util.Random;

public class NicknameGenerator {

    private static final List<String> PREFIXES = List.of(
        "텐쇼인", "히메미야", "키류", "사카사키", "히비키", "쿠누기", "나루카미",
        "아오이", "이사라", "마시로", "스오우", "칸자키", "니토", "유우키",
        "츠키나가", "마케지마", "센고쿠", "나구모", "아케호시", "하루카와",
        "시노", "오오가미", "토모에", "아오바", "사자나미", "타카미네", "아리",
        "오토가리", "신카이", "하스미", "텐마", "모리사와", "사쿠마", "후시미",
        "란", "이츠키", "세나", "하카제", "사에구사", "사가미", "히다카", "카게하라"
    );

    private static final List<String> SUFFIXES = List.of(
        "에이치", "토리", "쿠로", "나츠메", "와타루", "아키오미", "아라시",
        "유우타", "히나타", "마오", "토모야", "츠카사", "소마", "나즈나",
        "마코토", "레오", "마다라", "시노부", "테토라", "스바루", "소라",
        "하지메", "코오", "히요리", "츠무기", "쥰", "미도리", "아도니스",
        "코토리", "우미", "마리", "에리", "요시코", "하나마루", "리사",
        "카나타", "케이토", "미츠루", "치아키", "리츠", "유즈루", "나기사",
        "슈", "이즈미", "레이", "카오루", "이바라", "진", "호쿠토", "미카"
    );

    private static final Random random = new Random();

    // 두 개의 문자열을 랜덤하게 섞기
    private static String mixTwoNames(String name1, String name2) {
        int minLength = Math.min(name1.length(), name2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (random.nextBoolean()) {
                result.append(name1.charAt(i));
            } else {
                result.append(name2.charAt(i));
            }
        }

        // 더 긴 이름의 나머지를 붙일지 말지는 랜덤
        String longer = name1.length() > name2.length() ? name1 : name2;
        if (random.nextBoolean() && longer.length() > minLength) {
            result.append(longer.substring(minLength));
        }

        return result.toString();
    }

    public static String generateRandomNickname() {
        String prefix1 = PREFIXES.get(random.nextInt(PREFIXES.size()));
        String prefix2 = PREFIXES.get(random.nextInt(PREFIXES.size()));
        String mixedPrefix = mixTwoNames(prefix1, prefix2);

        String suffix1 = SUFFIXES.get(random.nextInt(SUFFIXES.size()));
        String suffix2 = SUFFIXES.get(random.nextInt(SUFFIXES.size()));
        String mixedSuffix = mixTwoNames(suffix1, suffix2);

        return mixedPrefix + " " + mixedSuffix;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomNickname());
        }
    }
}
