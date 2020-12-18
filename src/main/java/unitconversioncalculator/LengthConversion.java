public class LengthConversion {
    private static final String[] BEFORE_LENGTH_UNIT = {"millimeter", "centimeter", "meter", "kilometer", "inch", "feet", "yard", "mile", "nmile", "mil"};
    private static final String[] AFTER_LENGTH_UNIT = {"millimeter", "centimeter", "meter", "kilometer", "inch", "feet", "yard", "mile", "nmile", "mil"};
    private static final StringBuilder result = new StringBuilder();
    public static String lengthConversion(String before_command, String after_command, double num){
        if(before_command.equals(BEFORE_LENGTH_UNIT[0])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 0.1);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.000001);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 0.0393700787);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 0.0032808399);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 0.0010936133);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 6.2137119 * Math.pow(10, -7));
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 5.39956803 * Math.pow(10, -7));
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 39.3700787402);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[1])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 10);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.01);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.00001);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 0.3937007874);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 0.032808399);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 0.010936133);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.0000062137);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.0000053996);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 393.7007874016);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[2])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 1000);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 100);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 39.3700787402);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 3.280839895);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 1.0936132983);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.0006213712);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.0005399568);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 39370.078740158);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[3])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 1000000);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 100000);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 1000);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 39370.078740158);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 3280.8398950131);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 1093.6132983377);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.621371192);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.5399568035);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 39370.078740157);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[4])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 25.4);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 2.54);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 0.0833333333);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 0.0277777778);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.0000157828);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.0000137149);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 1000);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[5])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 304.8);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 30.48);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.3048);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.0003048);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 12);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 0.33333333);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.0001893939);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.0001645788);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 12000);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[6])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 914.4);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 91.44);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.9144);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 0.0009144);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 36);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 3);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 0.0005681818);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.0004937365);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 36000);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[7])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 1609344);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 160934.4);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 1609.344);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 1.609344);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 63360);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 5280);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 1760);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 0.8689762419);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 63360000);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[8])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 1852000);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 185200);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 1852);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 1.852);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 72913.385826772);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 6076.1154855643);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 2025.3718285214);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(1.150779448);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num * 72913385.826772);
            }
        }
        else if(before_command.equals(BEFORE_LENGTH_UNIT[9])){
            if(after_command.equals(AFTER_LENGTH_UNIT[0])){
                result.append(num * 0.0254);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[1])){
                result.append(num * 0.00254);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[2])){
                result.append(num * 0.0000254);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[3])){
                result.append(num * 2.54000000 * Math.pow(10, -8));
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[4])){
                result.append(num * 0.001);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[5])){
                result.append(num * 0.0000833333);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[6])){
                result.append(num * 0.0000277778);
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[7])){
                result.append(num * 1.57828283 * Math.pow(10, -8));
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[8])){
                result.append(num * 1.37149028 * Math.pow(10, -8));
            }
            else if(after_command.equals(AFTER_LENGTH_UNIT[9])){
                result.append(num);
            }
        }
        return result.toString();
    }
}
