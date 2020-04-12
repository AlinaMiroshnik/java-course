package lect9;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorExceprion, TypeException {
        this.size = size;
        this.color = parseColor(color);
        this.type = parseType(type);
    }

    private Color parseColor(String color) throws ColorExceprion {
        for (Color c : Color.values()) {
            if (c.name().equals(color)) {
                return c;
            }
        }
        throw new ColorExceprion("Wrong color");
    }

        private Type parseType (String type) throws TypeException {
            for (Type t : Type.values()) {
                if (t.name().equals(type)) {
                    return t;
                }
            }
            throw new TypeException("Wrong plant type");
        }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}



