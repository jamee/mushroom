import java.util.regex.Pattern
def pattern = Pattern.compile("src=['](.+)[']");
def matcher = pattern.matcher(saying)   
def count = matcher.replaceAll(/ \$\{}  $1 /)
println count;
println "\${}";  