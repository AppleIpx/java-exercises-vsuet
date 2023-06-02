package fifthHomework.calculator;

import java.util.ArrayList;
import java.util.Objects;

public class calc {
    ArrayList<Integer> indexAbs = new ArrayList<>();
    ArrayList<Integer> indexDegree = new ArrayList<>();
    ArrayList<Double> resultDegree = new ArrayList<>();
    ArrayList<Double> resultAbs = new ArrayList<>();
    ArrayList<String> fullAbs = new ArrayList<>();
    ArrayList<String> fullDegree = new ArrayList<>();
    int countForDegree = 0;
    String userFunction;
    double result;

    public double start(String userText) {
        userFunction = userText;
        if (checkForDifficultAction()) {
            findAbsAndDegreeAndWriteIndexForArray();
            writeFullABSAndDegreeInArray();
            countFullAbsAndDegree();
            result = counting();
        } else {
            Object rez1 = Rhino.CalculatingString(userText);
            result = (Double.parseDouble(Objects.toString(rez1)));
            return result;
        }
        return result;
    }

    private boolean checkForDifficultAction() {
        return userFunction.indexOf('|') > 0 || userFunction.indexOf('^') > 0;
    }

    private void findAbsAndDegreeAndWriteIndexForArray() {
        String userText = userFunction;
        for (int i = 0; i < userText.length(); i++) {
            if (userText.charAt(i) == '|') {
                indexAbs.add(i);
            } else if (userText.charAt(i) == '^') {
                int startIndexDegree, endIndexDegree;
                startIndexDegree = i - 2;
                endIndexDegree = i + 2;
                indexDegree.add(startIndexDegree);
                indexDegree.add(endIndexDegree);
            }
        }
    }

    private void writeFullABSAndDegreeInArray() {
        String userText = userFunction;
        for (int i = 0; i < indexAbs.size(); i += 2) {
            int startIndexAbs = indexAbs.get(i) + 1; // добавляем 1 потому что в строке тогда первым символом появится "|"
            int endIndexAbs = indexAbs.get(i + 1);
            userText = userText.substring(startIndexAbs, endIndexAbs);
            fullAbs.add(userText);
        }
        userText = userFunction;
        for (int i = 0; i < indexDegree.size(); i += 2) {
            int startIndexDegree, endIndexDegree;
            startIndexDegree = indexDegree.get(i);
            endIndexDegree = indexDegree.get(i + 1); // смотри предыдущий коммент
            userText = userText.substring(startIndexDegree, endIndexDegree);
            fullDegree.add(userText);
        }
    }

    private void countFullAbsAndDegree() {
        StringBuilder absStr;
        String degreeStr;
        StringBuilder absStr2 = new StringBuilder();
        double degreeDou, absDou = 0;
        if (fullAbs.size() != 0) {
            for (int i = 0; i < fullAbs.size(); i++) {
                absStr = new StringBuilder(fullAbs.get(i));
                if (absStr.toString().indexOf('^') > 0) {
                    degreeStr = fullDegree.get(i);
                    if (degreeStr.charAt(0) != '-') {
                        int dit = Integer.parseInt(String.valueOf(degreeStr.charAt(0)));
                        int pow = Integer.parseInt(String.valueOf(degreeStr.charAt(degreeStr.length() - 1)));
                        degreeDou = Math.pow(dit, pow);
                        resultDegree.add(degreeDou);
                        int indexDegree = absStr.toString().indexOf('^'); // вырезаем степенное выражение из строки
                        int startIndex = indexDegree - 2;
                        int endIndex = indexDegree + 2;
                        for (int j = 0; j < absStr.length(); j++) {
                            if (i < startIndex || i > endIndex) {
                                absStr = new StringBuilder(String.valueOf(absStr.charAt(i)));
                            } else if (i == endIndex) {
                                absStr.append(resultDegree.get(countForDegree));
                            }
                        }
                    } else {
                        int dit = Integer.parseInt(String.valueOf(degreeStr.charAt(1)));
                        int pow = Integer.parseInt(String.valueOf(degreeStr.charAt(degreeStr.length() - 1)));
                        degreeDou = -Math.pow(dit, pow);
                        resultDegree.add(degreeDou);
                        int indexDegree = absStr.toString().indexOf('^'); // вырезаем степенное выражение из строки
                        int startIndex = indexDegree - 2;
                        int endIndex = indexDegree + 2;
                        for (int j = 0; j < absStr.length(); j++) {
                            if (j < startIndex || j > endIndex) {
                                absStr2.append(absStr.charAt(j));
                            } else if (j == endIndex) {
                                absStr2.append(resultDegree.get(countForDegree)).append(" ");
                            }
                        }
                        Object rez = Rhino.CalculatingString(absStr2.toString());
                        resultAbs.add(Double.parseDouble(Objects.toString(rez)));
                    }
                } else {
                    for (int j = 0; j < absStr.length(); j++) {
                        absDou += Integer.parseInt(String.valueOf(absStr.charAt(i)));
                        resultAbs.add(absDou);
                    }
                }
            }
        } else {
            degreeStr = fullDegree.get(countForDegree);
            if (degreeStr.charAt(0) == '-') {
                int dit = Integer.parseInt(String.valueOf(degreeStr.charAt(1)));
                int pow = Integer.parseInt(String.valueOf(degreeStr.charAt(degreeStr.length() - 1)));
                degreeDou = -Math.pow(dit, pow);
                resultDegree.add(degreeDou);
            } else {
                if (degreeStr.charAt(0) == ' ') {
                    int dit = Integer.parseInt(String.valueOf(degreeStr.charAt(1)));
                    int pow = Integer.parseInt(String.valueOf(degreeStr.charAt(degreeStr.length() - 1)));
                    degreeDou = Math.pow(dit, pow);
                    resultDegree.add(degreeDou);
                } else {
                    int dit = Integer.parseInt(String.valueOf(degreeStr.charAt(0)));
                    int pow = Integer.parseInt(String.valueOf(degreeStr.charAt(degreeStr.length() - 1)));
                    degreeDou = Math.pow(dit, pow);
                    resultDegree.add(degreeDou);
                }
            }
        }
    }

    private double counting() {
        StringBuilder writeWithOutDegree = new StringBuilder();
        String function = userFunction;
        if (indexAbs.size() != 0) {
            String userText = userFunction;
            String firstSect, secondSent;
            firstSect = userText.substring(0, indexAbs.get(0));
            secondSent = userText.substring(indexAbs.get(1) + 1);
            String rez = firstSect + resultAbs.get(0) + secondSent;
            System.out.println(rez);
            Object rez1 = Rhino.CalculatingString(rez);
            result = (Double.parseDouble(Objects.toString(rez1)));
            return result;
        } else {
            int indexDegree = function.indexOf('^'); // вырезаем степенное выражение из строки
            int startIndex = indexDegree - 2;
            int endIndex = indexDegree + 2;
            for (int j = 0; j < function.length(); j++) {
                if (j < startIndex || j > endIndex) {
                    writeWithOutDegree.append(function.charAt(j));
                } else if (j == endIndex) {
                    writeWithOutDegree.append(resultDegree.get(countForDegree)).append(" ");
                }
            }
            Object rez = Rhino.CalculatingString(writeWithOutDegree.toString());
            result += (Double.parseDouble(Objects.toString(rez)));

//            for (int i = 0; i < resultDegree.size(); i++) {
//                result += resultDegree.get(i);
//            }
            return result;
        }
    }
}

