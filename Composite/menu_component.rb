# This class provides an interface for the composite and leaf nodes
class MenuComponent
  def add(menuComponent)
    raise 'unsupported operation exception'
  end

  def remove(menuComponent)
    raise 'unsupported operation exception'
  end

  def getChild(num)
    raise 'unsupported operation exception'
  end

  def getName
    raise 'unsupported operation exception'
  end

  def getDescription
    raise 'unsupported operation exception'
  end

  def getPrice
    raise 'unsupported operation exception'
  end

  def isVegetarian
    raise 'unsupported operation exception'
  end

  def printObject
    raise 'unsupported operation exception'
  end
end
