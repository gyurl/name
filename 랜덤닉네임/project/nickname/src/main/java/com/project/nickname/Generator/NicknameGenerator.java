// package com.project.nickname.Generator;

// import java.util.List;
// import java.util.Random;

// public class NicknameGenerator {

//     private static final List<String> PREFIXES = List.of(
//         "텐쇼인", "히메미야", "키류", "사카사키", "히비키", "쿠누기", "나루카미",
//         "아오이", "이사라", "마시로", "스오우", "칸자키", "니토", "유우키",
//         "츠키나가", "마케지마", "센고쿠", "나구모", "아케호시", "하루카와",
//         "시노", "오오가미", "토모에", "아오바", "사자나미", "타카미네", "아리",
//         "오토가리", "신카이", "하스미", "텐마", "모리사와", "사쿠마", "후시미",
//         "란", "이츠키", "세나", "하카제", "사에구사", "사가미", "히다카", "카게하라"
//     );

//     private static final List<String> SUFFIXES = List.of(
//         "에이치", "토리", "쿠로", "나츠메", "와타루", "아키오미", "아라시",
//         "유우타", "히나타", "마오", "토모야", "츠카사", "소마", "나즈나",
//         "마코토", "레오", "마다라", "시노부", "테토라", "스바루", "소라",
//         "하지메", "코오", "히요리", "츠무기", "쥰", "미도리", "아도니스",
//         "코토리", "우미", "마리", "에리", "요시코", "하나마루", "리사",
//         "카나타", "케이토", "미츠루", "치아키", "리츠", "유즈루", "나기사",
//         "슈", "이즈미", "레이", "카오루", "이바라", "진", "호쿠토", "미카"
//     );

//     private static final Random random = new Random();

//     // 두 개의 문자열을 랜덤하게 섞기
//     private static String mixTwoNames(String name1, String name2) {
//         int minLength = Math.min(name1.length(), name2.length());
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < minLength; i++) {
//             if (random.nextBoolean()) {
//                 result.append(name1.charAt(i));
//             } else {
//                 result.append(name2.charAt(i));
//             }
//         }

//         // 더 긴 이름의 나머지를 붙일지 말지는 랜덤
//         String longer = name1.length() > name2.length() ? name1 : name2;
//         if (random.nextBoolean() && longer.length() > minLength) {
//             result.append(longer.substring(minLength));
//         }

//         return result.toString();
//     }

//     public static String generateRandomNickname() {
//         String prefix1 = PREFIXES.get(random.nextInt(PREFIXES.size()));
//         String prefix2 = PREFIXES.get(random.nextInt(PREFIXES.size()));
//         String mixedPrefix = mixTwoNames(prefix1, prefix2);

//         String suffix1 = SUFFIXES.get(random.nextInt(SUFFIXES.size()));
//         String suffix2 = SUFFIXES.get(random.nextInt(SUFFIXES.size()));
//         String mixedSuffix = mixTwoNames(suffix1, suffix2);

//         return mixedPrefix + " " + mixedSuffix;
//     }

//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             System.out.println(generateRandomNickname());
//         }
//     }
// }

package com.project.nickname.Generator;

import java.util.List;
import java.util.Random;

public class NicknameGenerator {

    private static final List<String> NAMES = List.of(
        "우드세이지", "씨솔트", "라임바질", "블랙베리", "피오니", "블러쉬수에이드", "와일드블루벨", "넥타린허니",
        "잉글리쉬페어", "레드로즈", "화이트자스민", "다크앰버", "그린위트", "앰버패츌리", "파인앤유클립투스", "허니서클",
        "포피앤바알리", "사이프러스앤그레이프바인", "마그놀리아", "로즈앤화이트머스크", "유자", "그레이앰버", "프렌치라임블로섬",
        "탐다오", "필로시코스", "오로즈", "로엥", "도손", "로브르", "플레르드뽀", "에우데민떼",
        "블랑쉬", "모하비고스트", "집시워터", "라튤립", "로즈오브노맨즈랜드", "발다프리크", "슬로우댄스", "언네임드",
        "상탈33", "떼누아르29", "로즈31", "어나더13", "베티버46", "앰브레트9", "릴랙톤", "네롤리36",
        "로스트체리", "비터피치", "화이트스웨이드", "바닐라패탈", "오드우드", "네롤리포르토피노", "코스타아주라", "메탈릭",
        "타바코바닐라", "자스민루쥬", "블랙오키드", "샹탈블러쉬", "플뢰르드포르토피노", "로즈프릭", "솔레이블랑", "플럼재퍼니",
        "카페로즈", "엠버누아", "비치워크", "언더더레몬트리", "재즈클럽", "코피브레이크", "위켄드", "러지라이브러리",
        "세일링데이", "스프링타임인어팍", "댄싱온더문", "가브리엘", "알뤼르", "샹스", "코코마드모아젤", "넘버파이브",
        "베이지", "에고이스트", "크리스탈", "쁘렝땅", "오블루", "쟈도르", "미스디올", "퓨어푸아송",
        "옴므인트렌스", "소바쥬", "포에버앤에버", "자도르인조이", "로즈그리", "옴니아아메시스트", "블루마린", "쥬얼",
        "러브스토리", "에끌라드", "블러썸", "로즈페탈", "비바라쥬이시", "플라워밤", "플라워마켓", "리프레쉬",
        "에끌라드아르페쥬", "돌체", "인퓨전디아이리스", "인퓨전드만다린", "시트러스티", "일랑일랑", "아쿠아", "사파이어",
        "로투스", "네롤리", "오키드", "튤립", "블루벨", "카모마일", "자스민", "무스크", "샌달우드", "만다린", "베르가못",
        "피그리프", "프리지아", "레몬버베나", "히비스커스", "그린티", "패출리", "로즈마리", "라벤더", "카다멈", "시나몬",
        "화이트머스크", "파우더리", "엘릭서", "앰버노와르", "셀린느", "미스트", "뮤즈", "샤인", "쥬이시쿠튀르", "루미너스티아레",
        "코랄", "허그앤블룸", "피치앤크림", "쥬얼페탈", "데이브레이크", "미드나잇블랙체리", "썬릿피오니", "로지페탈", "로즈더스트"
    );

    private static final Random random = new Random();
 
    // 🔥 추가된 정적 메서드
  public static String generateRandomNickname() {
    return NAMES.get(random.nextInt(NAMES.size()));
}
}