def isUnique(s):
    return len(set(s)) == len(s)

def isUniqueSlower(s):
    sortedString = sorted(s)
    for i in xrange(len(sortedString)):
        if i == len(sortedString) - 1:
            return True
        else:
            if sortedString[i] == sortedString[i + 1]:
                return False

print isUnique("DONKEY")
print isUnique("KONG")
print isUnique("PLAYSTHEBONGOS")
print isUniqueSlower("BUT")
print isUniqueSlower("NOTWITHOUT")
print isUniqueSlower("HISDKCREW")
